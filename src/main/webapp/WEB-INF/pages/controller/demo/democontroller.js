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
            }
        });
    },
    
    editUser: function(grid, record) {
    	var view = Ext.widget('useredit');

        view.down('form').loadRecord(record);
    }
});