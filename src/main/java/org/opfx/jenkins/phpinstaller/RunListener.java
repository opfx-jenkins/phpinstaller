package org.opfx.jenkins.phpinstaller;

import hudson.model.Run;
import hudson.model.TaskListener;

public class RunListener extends hudson.model.listeners.RunListener<Run>{
	public void onStarted(Run Task, TaskListener listener) {
		Installation installation = null;
		if(installation == null) {
			try {
				
			}catch(Exception e) {
				
			}
		}
	}
}
