package org.opfx.jenkins.phpinstaller;

import java.io.IOException;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.BuildListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;

public class Provider extends Builder {

	private final String name;
	
	@DataBoundConstructor
	public Provider(String name) {
		this.name = name;
	}
	
	public Installation getInstallation() {
		return null;
	}
	
	@Override
	public boolean perform(AbstractBuild<?,?>build, Launcher launcher, BuildListener listener) throws IOException, InterruptedException {
		listener.getLogger().println("using php");
		return true;
	}
	
	@Override
	public Descriptor getDescriptor() {
		return (Descriptor)super.getDescriptor();
	}
	
	@Extension
	public static final class Descriptor extends BuildStepDescriptor<Builder> {

		@Override
		public boolean isApplicable(@SuppressWarnings("rawtypes") Class<? extends AbstractProject> jobType) {
			return true;
		}

		@Override
		public String getDisplayName() {
			return "Use PHP";
		}
		
//		public Installation[] getInstallations() {
//			
//		}
		
	}
}
