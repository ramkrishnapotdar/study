package com.ram.patterns.command;

public class RemoteControl {
	private Command cmd;

	public void pressButton()
	{
		cmd.execute();
	}
	public Command getCmd() {
		return cmd;
	}

	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}
	
}
