mainboard.items = {
		initNorth:function(){
			var north = Ext.create('Ext.Component',{
				region : 'north',
				height : 32.
				authoEl : {
					tag : 'div',
					html : '<p>north - generally for menus, toolbars and/or advertisements</p>'
				}
			});
			return north;
		},
		
		initSouth:function(){
			var south = Ext.create('Ext.Panel',{
				region : 'south',
				contentEl : 'south',
				split : true,
				height : 100,
				minSize : 100,
				maxSize : 200,
				collapsible : true,
				collapsed : true,
				title : 'Quick tools',
				margins : '0 0 0 0'
			});
			return south;
		},
		
		initEast:function(){
			var east = Ext.create('Ext.TabPanel',{
				region : 'east',
				title : 'Menu',
				dockedItems : [
				               //TODO
				],
				animCollapse: true,
				collapsible: true,
                split: true,
                width: 225, // give east and west regions a width
                minSize: 175,
                maxSize: 400,
                margins: '0 5 0 0',
                activeTab: 1,
                tabPosition: 'bottom',
                items : [
                         //TODO
                 ]
			});
			return east;
		},
		
		initWest:function(){
			
		}
}