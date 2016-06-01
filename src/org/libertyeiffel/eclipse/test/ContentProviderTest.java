package org.libertyeiffel.eclipse.test;

import org.easymock.EasyMock;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.libertyeiffel.eclipse.navigator.ILEProjectElement;
import org.libertyeiffel.eclipse.navigator.LEContentProvider;
import org.libertyeiffel.eclipse.navigator.LEProjectParent;

public class ContentProviderTest {
	private static final String PROJECT_NATURE = "org.libertyeiffel.eclipse.projectNature";
	
	private LEContentProvider contentProvider;
	
	@Test
	public void testGetParentForIWorkspaceRoot() {
		Object actual = null;
		
		IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		actual = contentProvider.getParent(workspaceRoot);
		
		Assert.assertNull(actual);
	}
	
	@Test
	public void testGetParentForNull() {
		Object actual = null;
		
		actual = contentProvider.getParent(null);
		Assert.assertNull(actual);
	}
	
	@Test
	public void testGetParentForObject() {
		Object actual = null;
		
		actual = contentProvider.getParent(new Object());
		
		Assert.assertNull(actual);
	}
	
	@Test
	public void testGetParentForIProject() {
		IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		IWorkspace workspace = EasyMock.createStrictMock(IWorkspace.class);
		IProject project = EasyMock.createStrictMock(IProject.class);
		project.getWorkspace();
		EasyMock.expectLastCall().andReturn(workspace);
		workspace.getRoot();
		EasyMock.expectLastCall().andReturn(workspaceRoot);
		
		EasyMock.replay(workspaceRoot, workspace, project);
		
		Object actual = contentProvider.getParent(project);
		Assert.assertNotNull(actual);
		
		EasyMock.verify(workspaceRoot, workspace, project);
	}
	
	@Test
	public void testGetParentForICustomProjectElement() {
		Object parent = EasyMock.createNiceControl();
		ILEProjectElement customProjectElement = EasyMock.createStrictMock(ILEProjectElement.class);
		customProjectElement.getParent();
		EasyMock.expectLastCall().andReturn(parent);
		
		EasyMock.replay(customProjectElement);
		
		Object actual = contentProvider.getParent(customProjectElement);
		Assert.assertNotNull(actual);
		
		EasyMock.verify(customProjectElement);
	}
	
	@Test
	public void testGetChildrenForIWorkspaceRootWithNoProjects() {
		IProject [] projects = {};
		IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		workspaceRoot.getProjects();
		EasyMock.expectLastCall().andReturn(projects);
		
		EasyMock.replay(workspaceRoot);
		
		Object[] actual = contentProvider.getChildren(workspaceRoot);
		Assert.assertNotNull(actual);
		Assert.assertTrue(actual.length == 0);
		
		EasyMock.verify(workspaceRoot);
	}
	
	@Test
	public void testGetChildrenForIWorkspaceWithNoCustomProjects() throws CoreException {
		IProject [] projects = new IProject[1];
		IProject project = EasyMock.createStrictMock(IProject.class);
		
		projects[0] = project;
		
		IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		workspaceRoot.getProjects();
		EasyMock.expectLastCall().andReturn(projects);
		
		project.getName();
		EasyMock.expectLastCall().andReturn("non-custom project");
		
		project.getNature(PROJECT_NATURE);
		EasyMock.expectLastCall().andReturn(null);
		
		EasyMock.replay(workspaceRoot, project);
		
		Object [] actual = contentProvider.getChildren(workspaceRoot);
		Assert.assertNotNull(actual);
		Assert.assertTrue(actual.length == 0);
		
		EasyMock.verify(workspaceRoot, project);
	}
	
	@Test
	public void testGetChildrenForIWorkspaceRootOneCustomProject() throws CoreException {
		IProject [] projects = new IProject[1];
		IProject project = EasyMock.createStrictMock(IProject.class);
		
		projects[0] = project;
		
		IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		workspaceRoot.getProjects();
		EasyMock.expectLastCall().andReturn(projects);
		
		String projectName = "custom project";
		project.getName();
		EasyMock.expectLastCall().andReturn(projectName);
		
		project.getNature(PROJECT_NATURE);
		EasyMock.expectLastCall().andReturn(EasyMock.createMock(IProjectNature.class));
		
		project.getName();
		EasyMock.expectLastCall().andReturn(projectName);
		
		project.getName();
		EasyMock.expectLastCall().andReturn(projectName);
		
		EasyMock.replay(workspaceRoot, project);
		
		Object [] actual = contentProvider.getChildren(workspaceRoot);
		Assert.assertNotNull(actual);
		Assert.assertTrue(actual.length == 1);
		Assert.assertEquals(project, ((LEProjectParent)actual[0]).getProject());
		
		EasyMock.verify(workspaceRoot, project);
	}
	
	@Test
	public void testGetChildrenForIWorkspaceRootWithOneCustomProjectTwoNonCustomProjects() throws CoreException {
		IProject nonCustomProject1 = EasyMock.createStrictMock(IProject.class);
		IProject nonCustomProject2 = EasyMock.createStrictMock(IProject.class);
		IProject customProject = EasyMock.createStrictMock(IProject.class);
		
		IProject[] projects = {
				nonCustomProject1,
				customProject,
				nonCustomProject2
		};
		
		IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		workspaceRoot.getProjects();
		EasyMock.expectLastCall().andReturn(projects);
		
		String bogusProjectName = "bogus project";
		String customProjectName = "custom project";
		nonCustomProject1.getName();
		EasyMock.expectLastCall().andReturn(bogusProjectName);
		
		nonCustomProject1.getNature(PROJECT_NATURE);
		EasyMock.expectLastCall().andReturn(null);
		
		customProject.getName();
		EasyMock.expectLastCall().andReturn(customProjectName);
		
		customProject.getNature(PROJECT_NATURE);
		EasyMock.expectLastCall().andReturn(EasyMock.createMock(IProjectNature.class));
		
		customProject.getName();
		EasyMock.expectLastCall().andReturn(customProjectName);
		
		nonCustomProject2.getName();
		EasyMock.expectLastCall().andReturn(bogusProjectName);
		
		nonCustomProject2.getNature(PROJECT_NATURE);
		EasyMock.expectLastCall().andReturn(null);
		
		EasyMock.replay(workspaceRoot, nonCustomProject1, customProject, nonCustomProject2);
		
		Object [] actual = contentProvider.getChildren(workspaceRoot);
		Assert.assertNotNull(actual);
		Assert.assertTrue(actual.length == 1);
		Assert.assertEquals(customProject, ((LEProjectParent)actual[0]).getProject());
		
		EasyMock.verify(workspaceRoot, nonCustomProject1, nonCustomProject2, customProject);
	}
	
	 @Test
	 public void testGetChildrenForIWorkspaceRootWithOneNonCustomProjectTwoCustomProjects() throws CoreException {
		 IProject customProject1 = EasyMock.createStrictMock(IProject.class);
		 IProject customProject2 = EasyMock.createStrictMock(IProject.class);
		 IProject nonCustomProject = EasyMock.createStrictMock(IProject.class);
		 
		 IProject[] projects = {
				 customProject1,
				 nonCustomProject,
				 customProject2
		 };
  
		 IWorkspaceRoot workspaceRoot = EasyMock.createStrictMock(IWorkspaceRoot.class);
		 workspaceRoot.getProjects();
		 EasyMock.expectLastCall().andReturn(projects);
	         
		 String bogusProjectName = "bogus project";
		 String customProjectName1 = "custom project 1";
		 String customProjectName2 = "custom project 2";
		 customProject1.getName();
		 EasyMock.expectLastCall().andReturn(customProjectName1);
	         
		 customProject1.getNature(PROJECT_NATURE);
		 EasyMock.expectLastCall().andReturn(EasyMock.createMock(IProjectNature.class));
	 
		 customProject1.getName();
		 EasyMock.expectLastCall().andReturn(customProjectName1);
	        
		 nonCustomProject.getName();
		 EasyMock.expectLastCall().andReturn(bogusProjectName);
	         
		 nonCustomProject.getNature(PROJECT_NATURE);
		 EasyMock.expectLastCall().andReturn(null);
	 
		 customProject2.getName();
		 EasyMock.expectLastCall().andReturn(customProjectName2);
	         
		 customProject2.getNature(PROJECT_NATURE);
		 EasyMock.expectLastCall().andReturn(EasyMock.createMock(IProjectNature.class));
	 
		 customProject2.getName();
		 EasyMock.expectLastCall().andReturn(customProjectName2);
	         
		 EasyMock.replay(workspaceRoot, nonCustomProject, customProject1, customProject2);
	         
		 Object [] actual = contentProvider.getChildren(workspaceRoot);
		 Assert.assertNotNull(actual);
		 Assert.assertTrue(actual.length == 2);
		 Assert.assertEquals(customProject1, ((LEProjectParent)actual[0]).getProject());
		 Assert.assertEquals(customProject2, ((LEProjectParent)actual[1]).getProject());
	         
		 EasyMock.verify(workspaceRoot, customProject1, nonCustomProject, customProject2);
	        
	 }
	 
	 @Test
	 public void testGetChildrenForIProjectNotCustomProject() {
		 IProject project = EasyMock.createStrictMock(IProject.class);
	         
		 Object [] actual = contentProvider.getChildren(project);
		 Assert.assertNotNull(actual);
		 Assert.assertTrue(actual.length == 0);
	 }
	     
	 @Test
	 public void testGetChildrenForICustomProjectElementWithNoChildren() {
		 assertChildrenFromICustomProjectElement(0);
	 }
	 
	 @Test
	 public void testGetChildrenForICustomProjectElementWithChildren() {
		 assertChildrenFromICustomProjectElement(5);
	 }
	     
	 @Before
	 public void setUp() {
		 contentProvider = new LEContentProvider();
	 }
	 
	 private void assertChildrenFromICustomProjectElement(int childCount) {
		 Object [] children = new Object[childCount];
		 ILEProjectElement customProjectElement = EasyMock.createStrictMock(ILEProjectElement.class);
	         
		 customProjectElement.getChildren();
		 EasyMock.expectLastCall().andReturn(children);
	 
	     EasyMock.replay(customProjectElement);
	         
	     Object [] actual = contentProvider.getChildren(customProjectElement);
	     Assert.assertNotNull(actual);
	     Assert.assertTrue(actual.length == childCount);
	 
	     EasyMock.verify(customProjectElement);
	 }
}
