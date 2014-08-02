Ext.define('AM.store.demo.demostore', {
    extend: 'Ext.data.Store',
    fields: ['name', 'email'],
    model:'AM.model.demo.demomodel',
    autoLoad:true,
    proxy:{
    	type:'ajax',
    	api:{
    		read:'demo/stroe',
    		update:'demo/updateStore'
    	},
    	reader:{
    		type:'json',
    		root:'data',
    		successProperty: 'success'
    	}
    }
});