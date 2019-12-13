window.onload = function () {

    // 格式
    new Rolldate({
        el: '#date-group1-1',
        format: 'YYYY-MM',
        beginYear: 2000,
        endYear: 2100
    })
    new Rolldate({
        el: '#date-group1-2',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100
    })
    new Rolldate({
        el: '#date-group1-3',
        format: 'YYYY-MM-DD hh'
    })
    new Rolldate({
        el: '#date-group1-4',
        format: 'YYYY-MM-DD hh:mm',
        beginYear: 2000,
        endYear: 2100
    })
    new Rolldate({
        el: '#date-group1-5',
        format: 'YYYY-MM-DD hh:mm:ss',
        beginYear: 2000,
        endYear: 2100
    })
    new Rolldate({
        el: '#date-group1-6',
        format: 'hh:mm'
    })
    new Rolldate({
        el: '#date-group1-7',
        format: 'hh:mm:ss'
    })
    new Rolldate({
        el: '#date-group1-8',
        format: 'YYYY',
        beginYear: 2000,
        endYear: 2100
    })
    new Rolldate({
        el: '#date-group1-9',
        format: 'MM'
    })
    new Rolldate({
        el: '#date-group1-10',
        format: 'DD'
    })
    new Rolldate({
        el: '#date-group1-11',
        format: 'hh'
    })
    new Rolldate({
        el: '#date-group1-12',
        format: 'mm'
    })
    new Rolldate({
        el: '#date-group1-13',
        format: 'ss'
    })
    new Rolldate({
        el: '#date-group1-14',
        format: 'YYYY/DD'
    })
    /* 回调函数
     * tips:	在vue及其他mvvm框架中使用时，在confirm中修改v-model绑定的数据即可
     */
    new Rolldate({
        el: '#date-group2-1',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100,
        init: function () {
            console.log('插件开始触发');
        },
        moveEnd: function (scroll) {
            console.log(scroll)
            console.log('滚动结束');
        },
        confirm: function (date) {
            console.log(date)
            console.log('确定按钮触发');
        },
        cancel: function () {
            console.log('插件运行取消');
        }
    })
    new Rolldate({
        el: '#date-group2-2',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100,
        init: function () {
            if (1 == 1) {
                console.log('阻止插件继续执行');
                return false;
            }
        }
    })
    new Rolldate({
        el: '#date-group2-3',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100,
        confirm: function (date) {
            return date.replace(/-/g, '/');
        }
    })
    // 自定义语言
    var lang = {
        title: '自定义标题',
        cancel: '取消',
        confirm: '确认',
        year: '年',
        month: '月',
        day: '日',
        hour: '时',
        min: '分',
        sec: '秒'
    };
    // 如果某个值未修改可不传 以上同 var lang = {title:'自定义标题'} 允许传空串
    new Rolldate({
        el: '#date-group3-1',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100,
        lang: lang
    })

    // 设置默认日期 内部使用document.getElementById('date').bindDate = new Date('2019/05/13');
    new Rolldate({
        el: '#date-group4-1',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100,
        value: '2017-10-21' //或2017-10-21 23:52:50
    })

    // el传dom对象，只支持单个
    new Rolldate({
        el: document.getElementById('date-group5-1'),
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100
    })

    // 分钟按指定数分隔
    new Rolldate({
        el: '#date-group6-1',
        format: 'hh:mm',
        minStep: 5
    })
    // 使用原生click
    new Rolldate({
        el: '#date-group7-1',
        trigger: 'click'
    })

    // 其他示例
    //日期判断
    new Rolldate({
        el: '#date-group8-1',
        format: 'YYYY-MM-DD',
        beginYear: 2000,
        endYear: 2100,
        confirm: function (date) {
            var d = new Date(),
                d1 = new Date(date.replace(/\-/g, "\/")),
                d2 = new Date(d.getFullYear() + '/' + (d.getMonth() + 1) + '/' + d.getDate()); //如果非'YYYY-MM-DD'格式，需要另做调整

            if (d1 < d2) {
                alert('不能小于当前的日期');
                return false;
            }
        }
    })
}