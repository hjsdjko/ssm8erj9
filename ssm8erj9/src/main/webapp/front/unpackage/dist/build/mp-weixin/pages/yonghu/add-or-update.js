(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/yonghu/add-or-update"],{"18c9":function(e,n,r){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=a(r("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function i(e,n,r,t,a,i,u){try{var o=e[i](u),s=o.value}catch(c){return void r(c)}o.done?n(s):Promise.resolve(s).then(t,a)}function u(e){return function(){var n=this,r=arguments;return new Promise((function(t,a){var u=e.apply(n,r);function o(e){i(u,t,a,o,s,"next",e)}function s(e){i(u,t,a,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("138c"))}.bind(null,r)).catch(r.oe)},s={data:function(){return{cross:"",ruleForm:{zhanghao:"",xingming:"",mima:"",touxiang:"",xingbie:"",nianling:"",shouji:"",youxiang:"",xinyongfen:"80"},xingbieOptions:[],xingbieIndex:0,user:{},ro:{zhanghao:!1,xingming:!1,mima:!1,touxiang:!1,xingbie:!1,nianling:!1,shouji:!1,youxiang:!1,xinyongfen:!1}}},components:{wPicker:o},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(n){var r=this;return u(t.default.mark((function a(){var i,u,o,s;return t.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return i=e.getStorageSync("nowTable"),a.next=3,r.$api.session(i);case 3:if(u=a.sent,r.user=u.data,r.ro.xinyongfen=!0,r.xingbieOptions="男,女".split(","),r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=15;break}return r.ruleForm.id=n.id,a.next=13,r.$api.info("yonghu",r.ruleForm.id);case 13:u=a.sent,r.ruleForm=u.data;case 15:if(r.cross=n.cross,!n.cross){a.next=59;break}o=e.getStorageSync("crossObj"),a.t0=t.default.keys(o);case 19:if((a.t1=a.t0()).done){a.next=59;break}if(s=a.t1.value,"zhanghao"!=s){a.next=25;break}return r.ruleForm.zhanghao=o[s],r.ro.zhanghao=!0,a.abrupt("continue",19);case 25:if("xingming"!=s){a.next=29;break}return r.ruleForm.xingming=o[s],r.ro.xingming=!0,a.abrupt("continue",19);case 29:if("mima"!=s){a.next=33;break}return r.ruleForm.mima=o[s],r.ro.mima=!0,a.abrupt("continue",19);case 33:if("touxiang"!=s){a.next=37;break}return r.ruleForm.touxiang=o[s],r.ro.touxiang=!0,a.abrupt("continue",19);case 37:if("xingbie"!=s){a.next=41;break}return r.ruleForm.xingbie=o[s],r.ro.xingbie=!0,a.abrupt("continue",19);case 41:if("nianling"!=s){a.next=45;break}return r.ruleForm.nianling=o[s],r.ro.nianling=!0,a.abrupt("continue",19);case 45:if("shouji"!=s){a.next=49;break}return r.ruleForm.shouji=o[s],r.ro.shouji=!0,a.abrupt("continue",19);case 49:if("youxiang"!=s){a.next=53;break}return r.ruleForm.youxiang=o[s],r.ro.youxiang=!0,a.abrupt("continue",19);case 53:if("xinyongfen"!=s){a.next=57;break}return r.ruleForm.xinyongfen=o[s],r.ro.xinyongfen=!0,a.abrupt("continue",19);case 57:a.next=19;break;case 59:r.styleChange();case 60:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},touxiangTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.touxiang="upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(t.default.mark((function r(){var a,i,u,o,s,c,l,g,f,m;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(n.ruleForm.zhanghao){r.next=3;break}return n.$utils.msg("账号不能为空"),r.abrupt("return");case 3:if(n.ruleForm.xingming){r.next=6;break}return n.$utils.msg("姓名不能为空"),r.abrupt("return");case 6:if(n.ruleForm.mima){r.next=9;break}return n.$utils.msg("密码不能为空"),r.abrupt("return");case 9:if(!n.ruleForm.nianling||n.$validate.isIntNumer(n.ruleForm.nianling)){r.next=12;break}return n.$utils.msg("年龄应输入整数"),r.abrupt("return");case 12:if(n.ruleForm.shouji){r.next=15;break}return n.$utils.msg("手机不能为空"),r.abrupt("return");case 15:if(!n.ruleForm.shouji||n.$validate.isMobile(n.ruleForm.shouji)){r.next=18;break}return n.$utils.msg("手机应输入手机格式"),r.abrupt("return");case 18:if(!n.ruleForm.youxiang||n.$validate.isEmail(n.ruleForm.youxiang)){r.next=21;break}return n.$utils.msg("邮箱应输入邮件格式"),r.abrupt("return");case 21:if(!n.ruleForm.xinyongfen||n.$validate.isIntNumer(n.ruleForm.xinyongfen)){r.next=24;break}return n.$utils.msg("信用分应输入整数"),r.abrupt("return");case 24:if(!n.cross){r.next=40;break}if(o=e.getStorageSync("statusColumnName"),s=e.getStorageSync("statusColumnValue"),""==o){r.next=40;break}if(c=e.getStorageSync("crossObj"),o.startsWith("[")){r.next=36;break}for(l in c)l==o&&(c[l]=s);return g=e.getStorageSync("crossTable"),r.next=34,n.$api.update("".concat(g),c);case 34:r.next=40;break;case 36:a=Number(e.getStorageSync("userid")),i=c["id"],u=e.getStorageSync("statusColumnName"),u=u.replace(/\[/,"").replace(/\]/,"");case 40:if(!i||!a){r.next=62;break}return n.ruleForm.crossuserid=a,n.ruleForm.crossrefid=i,f={page:1,limit:10,crossuserid:a,crossrefid:i},r.next=46,n.$api.list("yonghu",f);case 46:if(m=r.sent,!(m.data.total>=u)){r.next=52;break}return n.$utils.msg(e.getStorageSync("tips")),r.abrupt("return",!1);case 52:if(!n.ruleForm.id){r.next=57;break}return r.next=55,n.$api.update("yonghu",n.ruleForm);case 55:r.next=59;break;case 57:return r.next=59,n.$api.add("yonghu",n.ruleForm);case 59:n.$utils.msgBack("提交成功");case 60:r.next=70;break;case 62:if(!n.ruleForm.id){r.next=67;break}return r.next=65,n.$api.update("yonghu",n.ruleForm);case 65:r.next=69;break;case 67:return r.next=69,n.$api.add("yonghu",n.ruleForm);case 69:n.$utils.msgBack("提交成功");case 70:case"end":return r.stop()}}),r)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),t=n.getMonth()+1,a=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(r,"-").concat(t,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,r("543d")["default"])},"337f":function(e,n,r){"use strict";var t=r("f0de"),a=r.n(t);a.a},"429d":function(e,n,r){"use strict";r.r(n);var t=r("b784"),a=r("def3");for(var i in a)"default"!==i&&function(e){r.d(n,e,(function(){return a[e]}))}(i);r("337f");var u,o=r("f0c5"),s=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"a6b0e5f8",null,!1,t["a"],u);n["default"]=s.exports},b784:function(e,n,r){"use strict";var t;r.d(n,"b",(function(){return a})),r.d(n,"c",(function(){return i})),r.d(n,"a",(function(){return t}));var a=function(){var e=this,n=e.$createElement;e._self._c},i=[]},cdbe:function(e,n,r){"use strict";(function(e){r("1078");t(r("66fd"));var n=t(r("429d"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,r("543d")["createPage"])},def3:function(e,n,r){"use strict";r.r(n);var t=r("18c9"),a=r.n(t);for(var i in t)"default"!==i&&function(e){r.d(n,e,(function(){return t[e]}))}(i);n["default"]=a.a},f0de:function(e,n,r){}},[["cdbe","common/runtime","common/vendor"]]]);