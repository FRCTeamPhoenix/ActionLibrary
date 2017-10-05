package org.usfirst.frc.team2342.robot;

import org.usfirst.frc.team2342.robot.actions.ActionGoDistance;
import org.usfirst.frc.team2342.robot.actions.ActionQueue;

import edu.wpi.first.wpilibj.SampleRobot;

public class Robot extends SampleRobot {
	
	private ActionQueue queue;
	
	private void setupAuto()
	{
		
		queue.appendAction(new ActionGoDistance(5));
	}
	
	public Robot()
	{
		queue = new ActionQueue();
	}
	
	@Override
	public void autonomous()
	{
		setupAuto();
		
		while(isEnabled() && !queue.isCompleted())
			queue.execute();
	}	
}
