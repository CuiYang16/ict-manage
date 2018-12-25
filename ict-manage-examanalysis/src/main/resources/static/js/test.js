
var personCountChart; //考试人数统计图

function getPersonCountData(){
	$().ajax(
		url:
	);
}

/**
 * 设置考试人数统计图数据
 * */
function personCount(typeArray,dataArray){
	personCountChart = echarts.init(document.getElementById('personCountChart'));
	var weatherIcons = {
		    'Sunny': './data/asset/img/weather/sunny_128.png',
		    'Cloudy': './data/asset/img/weather/cloudy_128.png',
		    'Showers': './data/asset/img/weather/showers_128.png'
		},
		option = {
		    title: {
		        text: '考试人数分布',
		        subtext: '虚构数据',
		        left: 'center'
		    },
		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },
		    legend: {
		        // orient: 'vertical',
		        // top: 'middle',
		        bottom: 10,
		        left: 'center',
		        data: /*['西凉', '益州','兖州','荆州','幽州']*/typeArray
		    },
		    series : [
		    			dataArray
//		        		{value:535, name: '荆州'},
//		                {value:535, name: '荆州'},
//		                {value:510, name: '兖州'},
//		                {value:634, name: '益州'},
//		                {value:735, name: '西凉'}
		            ],
		            itemStyle: {
		                emphasis: {
		                    shadowBlur: 10,
		                    shadowOffsetX: 0,
		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
		                }
		            }
		        }
		    ]
		};
		personCountChart.setOption(option);
}