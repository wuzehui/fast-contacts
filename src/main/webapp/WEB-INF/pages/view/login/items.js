login.items = {
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
				maxLengthText : login.labels.maxUserLengthText
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
					if (login.loginForm.getForm().isValid()) {
						login.loginForm.getForm().submit({
							url : 'fastcontacts/login',
							method : 'POST',
							waitMsg : login.labels.waitingMsg,
							timeout : 60000,
							success : function(form, action){
								Ext.Msg.alert("提示","登录成功");
							},
							failure : function(form, action){
								Ext.Msg.alert("提示",login.labels.loginFailureMsg);
							}
						});
					}else{
						Ext.Msg.alert("提示",login.labels.loginAlertMsg);
					}
				 }
			});
			return loginBtn;
		}
}