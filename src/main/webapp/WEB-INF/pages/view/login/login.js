login = {
	loginForm : null,
	initPanel : function() {
		login.loginForm = Ext.create("Ext.form.Panel",{
			title : login.labels.title,
			frame : true,
			cls : 'login_form',
			buttonAlign: 'center',
			renderTo : Ext.getBody(),
			width : 250,
			height : 130,
			items : [login.items.initUsername(), 
			         login.items.initPassword()],
			buttons : [login.items.initRegister(),
			           login.items.initLogin()]
		});
	}
};