package com.cy.example.carrier;

import lombok.Data;

@Data
public class WorkFLowCa {

	private Long id;//申请单ID
	
	private String deploymentId;//部署对象ID
	
	private String taskId;		//任务ID
	
	private String outcome;		//连线名称
	
	private String comment;		//备注
}
