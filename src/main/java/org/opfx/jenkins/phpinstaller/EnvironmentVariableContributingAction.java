package org.opfx.jenkins.phpinstaller;

import hudson.EnvVars;
import hudson.model.AbstractBuild;
import hudson.model.EnvironmentContributingAction;

public class EnvironmentVariableContributingAction implements EnvironmentContributingAction {

	String home;
	
	public EnvironmentVariableContributingAction(Installation installation) {
		this.home=installation.getHome();
	}
	
 	@Override
	public String getIconFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrlName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildEnvVars(AbstractBuild<?, ?> build, EnvVars env) {
		env.put("PHP_HOME", home);
		
	}

}
