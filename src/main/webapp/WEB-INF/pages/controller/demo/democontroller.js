Ext.define('AM.controller.demo.democontroller', {
    extend: 'Ext.app.Controller',
    
    stores:[
      'demo.demostore'
    ],
    models:['demo.demomodel'],
    views:[
      'demo.demoview',
      'demo.demoedit'
	],

    init: function() {
    	this.control({
            'viewport > demoview': {
                itemdblclick: this.editUser
            },
            'demoedit button[action=save]':{
            	click:this.updateStore
            }
        });
    },
    
    editUser: function(grid, record) {
    	var view = Ext.widget('demoedit');

        view.down('form').loadRecord(record);
    },
    
    updateStore:function(button){
    	console.log('clicked the Save button');
    	 var win    = button.up('window'),
         form   = win.down('form'),
         record = form.getRecord(),
         values = form.getValues();
    	 Ext.Ajax.request({
    		 url:"demo/updateStore",
    		 method : 'post',
    		 params:{
    			 values:values
    		 },
    		 success:function(response, options){
    			 var o = Ext.util.JSON.decode(response.responseText);  
    			 alert(o.msg);  
    			 record.set(values);
    		 },
    		 failure:function(){
    			 alert("failer");
    		 }
    	 });
    	// record.set(values);
    	 win.close();
    	// this.getDemoStore().sync();
    }
});