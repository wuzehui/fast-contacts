Ext.application({
    requires: ['Ext.container.Viewport'],  
    name: 'AM',

    appFolder: 'pages',
    
    controllers: [
        'demo.democontroller'
    ],

    launch: function() {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: [
                {
                	 xtype: 'demoview'
                }
            ]
        });
    }
});