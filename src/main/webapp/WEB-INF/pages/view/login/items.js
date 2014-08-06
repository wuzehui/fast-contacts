login.items = {
		//init alert msg
		initAlertMsg:function(){
			var alertLabel = new Ext.form.Label({
				id : 'loing_item_alert_label_id',
				text : '',
				hidden : false,
				style : 'color:#EA0000',
				margin : '0 0 10 100'
			});
			return alertLabel;
		},
		//user name text filed
		initUsername:function(){
			var username = new Ext.form.TextField({
				width : 200,
				allowBlank : false,
				maxLength : 20,
				name : 'username',
				fieldLabel : login.labels.userTitle,
				labelWidth : 45,
				labelAlign : 'right',
				blankText : login.labels.userEmptyText,
				maxLengthText : login.labels.maxUserLengthText,
				margin : '10 0 10 0'
			});
			return username;
		},
		//password text field
		initPassword:function(){
			var pass = new Ext.form.TextField({
				width : 200,
				allowBlank : false,
				maxLength : 20,
				name : 'password',
				fieldLabel : login.labels.passTitle,
				labelWidth : 45,
				labelAlign : 'right',
				blankText : login.labels.passEmptyText,
				blankText : login.labels.passEmptyText,
				inputType : 'password'
			});
			return pass;
		},
		//register button
		initRegister:function(){
			var register = new Ext.Button({
				 text: login.labels.registerText,
				 handler: function(){
					 Ext.Msg.alert("提示", "尚未实现");
				 }
			});
			return register;
		},
		//login button
		initLogin:function(){
			var loginBtn = new Ext.Button({
				 text: login.labels.loginText,
				 handler: function(){
					var label = Ext.getCmp('loing_item_alert_label_id');
					label.setText(' ');
					if (login.loginForm.getForm().isValid()) {
						login.loginForm.getForm().submit({
							url : 'fastcontacts/login',
							method : 'POST',
							waitMsg : login.labels.waitingMsg,
							timeout : 60000,
							success : function(form, action){
								//TODO 跳转
								Ext.Msg.alert("提示1","登录成功,准备跳转");
							},
							failure : function(form, action){
								label.setText(action.result.errMsg);
							}
						});
					}else{
						label.setText(login.labels.loginAlertMsg);
					}
				 }
			});
			return loginBtn;
		}
}