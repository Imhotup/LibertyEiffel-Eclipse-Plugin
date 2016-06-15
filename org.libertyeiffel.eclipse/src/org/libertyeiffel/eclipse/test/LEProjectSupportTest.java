/*******************************************************************************
 * Copyright notice below. Please read.
 *
 * Liberty Eiffel is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License,
 * as published by the Free Software Foundation; either version 2, or (at your option) any later version.
 * Liberty Eiffel is distributed in the hope that it will be useful but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have
 * received a copy of the GNU General Public License along with Liberty Eiffel; see the file COPYING. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * Copyright (C) 2011-2016: Cyril ADRIAN, Paolo REDAELLI, Raphael MACK
 *
 * http://www.gnu.org/software/liberty-eiffel/
 *
 *
 * Liberty Eiffel is based on SmartEiffel (Copyrights below)
 *
 * Copyright(C) 1994-2002: INRIA - LORIA (INRIA Lorraine) - ESIAL U.H.P.       - University of Nancy 1 - FRANCE
 * Copyright(C) 2003-2006: INRIA - LORIA (INRIA Lorraine) - I.U.T. Charlemagne - University of Nancy 2 - FRANCE
 *
 * Authors: Dominique COLNET, Philippe RIBET, Cyril ADRIAN, Vincent CROIZIER, Frederic MERIZEN
 * 
 ******************************************************************************/
package org.libertyeiffel.eclipse.test;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.AssertionFailedException;
import org.eclipse.core.runtime.CoreException;
import org.junit.Assert;
import org.junit.Test;
import org.libertyeiffel.eclipse.natures.LEProjectSupport;
import org.libertyeiffel.eclipse.natures.ProjectNature;

public class LEProjectSupportTest {
	
	@Test
	public void testCreateProjectWithDifferentLocationArg() throws URISyntaxException, DocumentException, 
		CoreException {
			String workspaceFilePath = "/home/fabu/junit-workspace2";
			File worksapce = createTempWorkspace(workspaceFilePath);
			
			String projectName = "delete-me";
			String projectPath = workspaceFilePath + "/" + projectName;
			URI location = new URI("file:/" + projectPath);
			
			assertProjectDotFileAndStructureAndNatureExist(projectPath, projectName, location);
			deleteTempWorkspace(worksapce);
	}
	
	@Test
	public void testCreateProjectWithEmptyNameArg() {
		String projectName = " ";
		assertCreateProjectWithBadNameArg(projectName);
	}
	
	@Test
	public void testCreateProjectWithNullArg() {
		String projectName = null;
		assertCreateProjectWithBadNameArg(projectName);
	}
	
	@Test
	public void testCreateProjectWithGoodArgs() throws DocumentException, CoreException {
		String workspaceFilePath = "/home/fabu/junit-workspace";
		String projectName = "delete-me";
		String projectPath = workspaceFilePath + "/" + projectName;
		
		URI location = null;
		assertProjectDotFileAndStructureAndNatureExist(projectPath, projectName, location);
	}
	
	private void assertProjectDotFileAndStructureAndNatureExist(String projectPath, String name, URI location) throws
		DocumentException, CoreException {
			IProject project = LEProjectSupport.createProject(name, location);
			
			String projectFilePath = projectPath + "/" + ".project";
			String[] emptyNodes = { "/projectDescription/comment", "/projectDescription/projects", "/projectDescription/buildSpec" };
	        String[] nonEmptyNodes = { "/projectDescription/name", "/projectDescription/natures/nature" };
	        
	        Assert.assertNotNull(project);
	        assertFileExists(projectPath);
	        assertAllElementsEmptyExcept(projectFilePath, emptyNodes, nonEmptyNodes);
	        assertNatureIn(project);
	        assertFolderStructureIn(projectPath);
	        
	        project.delete(true, null);
	}
	
	private void assertFolderStructureIn(String projectPath) {
		String[] paths = { "bin", "src" };
		for (String path : paths) {
			File file = new File(projectPath + "/" + path);
			if (!file.exists()) {
				Assert.fail("Folder structure " + path + "does not exist.");
			}
		}
	}
	
	private void assertNatureIn(IProject project) throws CoreException {
		IProjectDescription descriptions = project.getDescription();
		String[] natureIds = descriptions.getNatureIds();
		if (natureIds.length != 1) {
			Assert.fail("No natures found in project.");
		}
		
		if (!natureIds[0].equals(ProjectNature.NATURE_ID)) {
			Assert.fail("Liberty Eiffel Project natures not found in project");
		}
	}
	
	private void assertAllElementsEmptyExcept(String projectFilePath, String[] emptyNodes, String[] nonEmptyNodes) throws
		DocumentException {
			SAXReader reader = new SAXReader();
			Document document = reader.read(projectFilePath);
			int strLength;
			for (String emptyNode : emptyNodes) {
				strLength = document.selectSingleNode(emptyNode).getText().trim().length();
				if (strLength != 0) {
					Assert.fail("Node " + emptyNode + " was non-empty!");
				}
			}
			
			for (String nonEmptyNode : nonEmptyNodes) {
				strLength = document.selectSingleNode(nonEmptyNode).getText().trim().length();
				if (strLength == 0) {
					Assert.fail("Node " + nonEmptyNode + " was empty");
				}
			}
	}
	
	private void assertFileExists(String projectFilePath) {
		File file =  new File(projectFilePath);
		
		if (!file.exists()) {
			Assert.fail("File " + projectFilePath + "does not exits.");
		}
	}
	
	private void assertCreateProjectWithBadNameArg(String name) {
		URI location = null;
		try {
			LEProjectSupport.createProject(name, location);
			Assert.fail("The call to LEProjectSupport.createProject() did not fail");
		} catch (AssertionFailedException e) {
			// TODO: handle exception
		}
	}
	
	private void deleteTempWorkspace(File workspace) {
		boolean deleted = workspace.delete();
		if (!deleted) {
			Assert.fail("Unable to delete the new workspace dir at " + workspace);
		}
	}
	
	private File createTempWorkspace(String pathToWorkspace) {
		File workspace = new File(pathToWorkspace);
		if (!workspace.exists()) {
			boolean dirCreated = workspace.mkdir();
			if (!dirCreated) {
				Assert.fail("Unable to create the new worksapce dir at " + workspace);
			}
		}
		
		return workspace;
		
	}
}
