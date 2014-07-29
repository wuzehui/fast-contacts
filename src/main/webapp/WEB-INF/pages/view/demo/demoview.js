Ext.define('AM.view.demo.demoview' ,{
    extend: 'Ext.grid.Panel',
    alias : 'widget.demoview',

    title : 'All Users',
    
    store : 'demo.demostore',

    initComponent: function() {
//        this.store = {
//            fields: ['name', 'email'],
//            data  : [
//                {name: 'Ed',    email: 'ed@sencha.com'},
//                {name: 'Tommy', email: 'tommy@sencha.com'}
//            ]
//        };

        this.columns = [
            {header: 'Name',  dataIndex: 'name',  flex: 1},
            {header: 'Email', dataIndex: 'email', flex: 1}
        ];

        this.callParent(arguments);
    }
});