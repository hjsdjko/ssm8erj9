(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-storeup-add-or-update"],{"144f":function(e,r,t){"use strict";var i=t("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,t("a481"),t("c5f6"),t("f559"),t("ac6a"),t("96cf");var a=i(t("3b8d")),n=i(t("e2b1")),o={data:function(){return{cross:"",ruleForm:{userid:"",refid:"",tablename:"",name:"",picture:"",type:"",inteltype:""},user:{},ro:{userid:!1,refid:!1,tablename:!1,name:!1,picture:!1,type:!1,inteltype:!1}}},components:{wPicker:n.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(r){var t,i,a,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return t=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(t);case 3:if(i=e.sent,this.user=i.data,this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=13;break}return this.ruleForm.id=r.id,e.next=11,this.$api.info("storeup",this.ruleForm.id);case 11:i=e.sent,this.ruleForm=i.data;case 13:if(this.cross=r.cross,!r.cross){e.next=49;break}a=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(a);case 17:if((e.t1=e.t0()).done){e.next=49;break}if(n=e.t1.value,"userid"!=n){e.next=23;break}return this.ruleForm.userid=a[n],this.ro.userid=!0,e.abrupt("continue",17);case 23:if("refid"!=n){e.next=27;break}return this.ruleForm.refid=a[n],this.ro.refid=!0,e.abrupt("continue",17);case 27:if("tablename"!=n){e.next=31;break}return this.ruleForm.tablename=a[n],this.ro.tablename=!0,e.abrupt("continue",17);case 31:if("name"!=n){e.next=35;break}return this.ruleForm.name=a[n],this.ro.name=!0,e.abrupt("continue",17);case 35:if("picture"!=n){e.next=39;break}return this.ruleForm.picture=a[n],this.ro.picture=!0,e.abrupt("continue",17);case 39:if("type"!=n){e.next=43;break}return this.ruleForm.type=a[n],this.ro.type=!0,e.abrupt("continue",17);case 43:if("inteltype"!=n){e.next=47;break}return this.ruleForm.inteltype=a[n],this.ro.inteltype=!0,e.abrupt("continue",17);case 47:e.next=17;break;case 49:this.styleChange();case 50:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){}))},pictureTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.picture="upload/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,a.default)(regeneratorRuntime.mark((function e(){var r,t,i,a,n,o,s,d,u,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.userid){e.next=3;break}return this.$utils.msg("用户id不能为空"),e.abrupt("return");case 3:if(this.ruleForm.name){e.next=6;break}return this.$utils.msg("收藏名称不能为空"),e.abrupt("return");case 6:if(this.ruleForm.picture){e.next=9;break}return this.$utils.msg("收藏图片不能为空"),e.abrupt("return");case 9:if(!this.cross){e.next=25;break}if(a=uni.getStorageSync("statusColumnName"),n=uni.getStorageSync("statusColumnValue"),""==a){e.next=25;break}if(o=uni.getStorageSync("crossObj"),a.startsWith("[")){e.next=21;break}for(s in o)s==a&&(o[s]=n);return d=uni.getStorageSync("crossTable"),e.next=19,this.$api.update("".concat(d),o);case 19:e.next=25;break;case 21:r=Number(uni.getStorageSync("userid")),t=o["id"],i=uni.getStorageSync("statusColumnName"),i=i.replace(/\[/,"").replace(/\]/,"");case 25:if(!t||!r){e.next=47;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=t,u={page:1,limit:10,crossuserid:r,crossrefid:t},e.next=31,this.$api.list("storeup",u);case 31:if(c=e.sent,!(c.data.total>=i)){e.next=37;break}return this.$utils.msg(uni.getStorageSync("tips")),e.abrupt("return",!1);case 37:if(!this.ruleForm.id){e.next=42;break}return e.next=40,this.$api.update("storeup",this.ruleForm);case 40:e.next=44;break;case 42:return e.next=44,this.$api.add("storeup",this.ruleForm);case 44:this.$utils.msgBack("提交成功");case 45:e.next=55;break;case 47:if(!this.ruleForm.id){e.next=52;break}return e.next=50,this.$api.update("storeup",this.ruleForm);case 50:e.next=54;break;case 52:return e.next=54,this.$api.add("storeup",this.ruleForm);case 54:this.$utils.msgBack("提交成功");case 55:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,t=r.getFullYear(),i=r.getMonth()+1,a=r.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,a=a>9?a:"0"+a,"".concat(t,"-").concat(i,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};r.default=o},"1fcc":function(e,r,t){var i=t("c522");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var a=t("4f06").default;a("4344a77f",i,!0,{sourceMap:!1,shadowMode:!1})},"60c4":function(e,r,t){"use strict";var i=t("1fcc"),a=t.n(i);a.a},c179:function(e,r,t){"use strict";var i,a=function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("v-uni-view",{staticClass:"content"},[t("v-uni-form",{staticClass:"app-update-pv"},[t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx 0 0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"100rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("表名")]),t("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(204, 170, 143, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"50rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.tablename,placeholder:"表名"},model:{value:e.ruleForm.tablename,callback:function(r){e.$set(e.ruleForm,"tablename",r)},expression:"ruleForm.tablename"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx 0 0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"100rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("收藏名称")]),t("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(204, 170, 143, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"50rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.name,placeholder:"收藏名称"},model:{value:e.ruleForm.name,callback:function(r){e.$set(e.ruleForm,"name",r)},expression:"ruleForm.name"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx 0 0",boxShadow:"0 0 0px rgba(0,0,0,.3)",backgroundColor:"rgba(255, 255, 255, 1)",borderColor:"#ccc",margin:"0 0 20rpx 0",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"108rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.pictureTap.apply(void 0,arguments)}}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("收藏图片")]),t("v-uni-view",{staticClass:"right-input",staticStyle:{padding:"0"}},[e.ruleForm.picture?t("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:e.baseUrl+e.ruleForm.picture,mode:"aspectFill"}}):t("v-uni-image",{staticClass:"avator",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",borderRadius:"100%",borderWidth:"0",width:"88rpx",borderStyle:"solid",height:"88rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1)],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx 0 0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"100rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("类型(1:收藏,21:赞,22:踩)")]),t("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(204, 170, 143, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"50rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.type,placeholder:"类型(1:收藏,21:赞,22:踩)"},model:{value:e.ruleForm.type,callback:function(r){e.$set(e.ruleForm,"type",r)},expression:"ruleForm.type"}})],1),t("v-uni-view",{staticClass:"cu-form-group",style:{padding:"0 24rpx 0 0",boxShadow:"0 0 0px rgba(0,0,0,.3)",margin:"0 0 20rpx 0",borderColor:"#ccc",backgroundColor:"rgba(255, 255, 255, 1)",borderRadius:"0",borderWidth:"0",width:"100%",borderStyle:"solid",height:"100rpx"}},[t("v-uni-view",{staticClass:"title",style:{padding:"0",boxShadow:"0 0 16rpx rgba(0,0,0,0)",margin:"0",borderColor:"#ccc",backgroundColor:"rgba(0,0,0,0)",color:"rgba(161, 161, 161, 1)",textAlign:"center",borderRadius:"0",borderWidth:"0",width:"160rpx",lineHeight:"80rpx",fontSize:"28rpx",borderStyle:"solid"}},[e._v("推荐类型")]),t("v-uni-input",{style:{padding:"0 30rpx",boxShadow:"0 0 0px rgba(0,0,0,.6) inset",margin:"0",borderColor:"rgba(204, 170, 143, 1)",backgroundColor:"rgba(255, 255, 255, 0)",color:"rgba(0, 0, 0, 1)",textAlign:"left",borderRadius:"50rpx",borderWidth:"2rpx",width:"calc(100% - 160rpx)",fontSize:"28rpx",borderStyle:"solid",height:"60rpx"},attrs:{disabled:e.ro.inteltype,placeholder:"推荐类型"},model:{value:e.ruleForm.inteltype,callback:function(r){e.$set(e.ruleForm,"inteltype",r)},expression:"ruleForm.inteltype"}})],1),t("v-uni-view",{staticClass:"btn"},[t("v-uni-button",{staticClass:"bg-red",style:{padding:"0",boxShadow:"0 0 0px rgba(0,0,0,0) inset",margin:"0",backgroundColor:"rgba(239, 184, 101, 1)",borderColor:"#409EFF",borderRadius:"48rpx",color:"#fff",borderWidth:"0",width:"60%",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)},n=[];t.d(r,"b",(function(){return a})),t.d(r,"c",(function(){return n})),t.d(r,"a",(function(){return i}))},c3d0:function(e,r,t){"use strict";t.r(r);var i=t("144f"),a=t.n(i);for(var n in i)"default"!==n&&function(e){t.d(r,e,(function(){return i[e]}))}(n);r["default"]=a.a},c522:function(e,r,t){var i=t("24fb");r=i(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.container[data-v-ef9f608e]{padding:%?20?%}.content[data-v-ef9f608e]:after{position:fixed;top:0;right:0;left:0;bottom:0;content:"";background-image:url(http://codegen.caihongy.cn/20220215/5bfbd716943f42d89128fb2292866693.png);background-attachment:fixed;background-size:cover;background-position:50%}uni-textarea[data-v-ef9f608e]{border:%?1?% solid #eee;border-radius:%?20?%;padding:%?20?%}.title[data-v-ef9f608e]{width:%?180?%}.avator[data-v-ef9f608e]{width:%?150?%;height:%?60?%}.right-input[data-v-ef9f608e]{-webkit-box-flex:1;-webkit-flex:1;flex:1;text-align:left;padding:0 %?24?%}.cu-form-group.active[data-v-ef9f608e]{-webkit-box-pack:justify;-webkit-justify-content:space-between;justify-content:space-between}.btn[data-v-ef9f608e]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-pack:center;-webkit-justify-content:center;justify-content:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;padding:%?20?% 0}.cu-form-group[data-v-ef9f608e]{padding:0 %?24?%;background-color:initial;min-height:inherit}.cu-form-group + .cu-form-group[data-v-ef9f608e]{border:0}.cu-form-group uni-input[data-v-ef9f608e]{padding:0 %?30?%}.uni-input[data-v-ef9f608e]{padding:0 %?30?%}.cu-form-group uni-textarea[data-v-ef9f608e]{padding:%?30?%;margin:0}.cu-form-group uni-picker[data-v-ef9f608e]::after{line-height:%?80?%}.select .uni-input[data-v-ef9f608e]{line-height:%?80?%}.input .right-input[data-v-ef9f608e]{line-height:%?60?%}',""]),e.exports=r},d26a:function(e,r,t){"use strict";t.r(r);var i=t("c179"),a=t("c3d0");for(var n in a)"default"!==n&&function(e){t.d(r,e,(function(){return a[e]}))}(n);t("60c4");var o,s=t("f0c5"),d=Object(s["a"])(a["default"],i["b"],i["c"],!1,null,"ef9f608e",null,!1,i["a"],o);r["default"]=d.exports}}]);