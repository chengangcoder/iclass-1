/**
 * Created by JasonTang on 2/14/2017.
 */
var Logined = function () {
    //request url
    var ip = "localhost";
    //var ip = "115.159.63.34";
    var port = "8080";
    var rurl = "http://"+ip+":"+port+"/iclass";
    //获取已登录的用户信息
    var a = function () {
        $(function () {
            $.ajax({
                type: "post",
                dataType: "jsonp",
                jsonp: "callback",
                url: rurl + "/getLoginedUserInfo",
                timeout: 3000,
                success: function (logineduserdata) {
                    alert(logineduserdata.username);
                },
                error: function (logineduserdata) {
                    alert("请求用户信息出错,错误信息:"+logineduserdata);
                }
            })
        })
    };
    // jQuery191031458320198317424_1487004197538({code: "1004", msg: "工号可用", data: null});
    // jQuery19109494609197273987_1487004113222({username: "管理员", usercode: "1308030331", userrole: "管理员"})

    return {
        init: function () {
            a();
        },
    }
}();