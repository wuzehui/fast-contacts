mainboard = {
		mainboard : null,
		initMainboard : function(){
			mainboard.mainboard = Ext.create('Ext.Viewport',{
				id : 'mainboard_id',
				layout : 'board',
				renderTo : Ext.getBody(),
				items : [
				]
			});
		}
}