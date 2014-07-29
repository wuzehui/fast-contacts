Ext.define('AM.store.demo.demostore', {
    extend: 'Ext.data.Store',
    fields: ['name', 'email'],
    model:'AM.model.demo.demomodel',
    data: [
        {name: 'Ed',    email: 'ed@sencha.com'},
        {name: 'Tommy', email: 'tommy@sencha.com'}
    ]
});