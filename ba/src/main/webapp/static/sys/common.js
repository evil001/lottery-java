function addTab(tabId,title,url){  
	if($("#"+tabId).tabs('exists',title)){
		$("#"+tabId).tabs('select',title);
	}else{
		$("#"+tabId).tabs('add',{    
            title:title,    
            href :url,    
            closable:true    
        });  
	}
}

var uploadify_onSelectError = function(file , errorCode , errorMsg){
	var msgText = "上传失败\n";  
    switch (errorCode) {  
        case SWFUpload.QUEUE_ERROR.QUEUE_LIMIT_EXCEEDED:  
            //this.queueData.errorMsg = "每次最多上传 " + this.settings.queueSizeLimit + "个文件";  
            msgText += "每次最多上传 " + 7 + "个文件";  
            break;  
        case SWFUpload.QUEUE_ERROR.FILE_EXCEEDS_SIZE_LIMIT:  
            msgText += "文件大小超过限制( " + this.settings.fileSizeLimit + " )";  
            break;  
        case SWFUpload.QUEUE_ERROR.ZERO_BYTE_FILE:  
            msgText += "文件大小为0";  
            break;  
        case SWFUpload.QUEUE_ERROR.INVALID_FILETYPE:  
            msgText += "文件格式不正确，仅限 " + this.settings.fileTypeExts;  
            break;  
        default:  
            msgText += "错误代码：" + errorCode + "\n" + errorMsg;  
    }  
    alert(msgText);  
}

var uploadify_onUploadError = function(file, errorCode, errorMsg, errorString) {  
    // 手工取消不弹出提示  
    if (errorCode == SWFUpload.UPLOAD_ERROR.FILE_CANCELLED  
            || errorCode == SWFUpload.UPLOAD_ERROR.UPLOAD_STOPPED) {  
        return;  
    }  
    var msgText = "上传失败\n";  
    switch (errorCode) {  
        case SWFUpload.UPLOAD_ERROR.HTTP_ERROR:  
            msgText += "HTTP 错误\n" + errorMsg;  
            break;  
        case SWFUpload.UPLOAD_ERROR.MISSING_UPLOAD_URL:  
            msgText += "上传文件丢失，请重新上传";  
            break;  
        case SWFUpload.UPLOAD_ERROR.IO_ERROR:  
            msgText += "IO错误";  
            break;  
        case SWFUpload.UPLOAD_ERROR.SECURITY_ERROR:  
            msgText += "安全性错误\n" + errorMsg;  
            break;  
        case SWFUpload.UPLOAD_ERROR.UPLOAD_LIMIT_EXCEEDED:  
            msgText += "每次最多上传 " + this.settings.uploadLimit + "个";  
            break;  
        case SWFUpload.UPLOAD_ERROR.UPLOAD_FAILED:  
            msgText += errorMsg;  
            break;  
        case SWFUpload.UPLOAD_ERROR.SPECIFIED_FILE_ID_NOT_FOUND:  
            msgText += "找不到指定文件，请重新操作";  
            break;  
        case SWFUpload.UPLOAD_ERROR.FILE_VALIDATION_FAILED:  
            msgText += "参数错误";  
            break;  
        default:  
            msgText += "文件:" + file.name + "\n错误码:" + errorCode + "\n"  
                    + errorMsg + "\n" + errorString;  
    }  
    alert(msgText);  
}  

Date.prototype.format = function (format) {  
    var o = {  
        "M+": this.getMonth() + 1, // month  
        "d+": this.getDate(), // day  
        "h+": this.getHours(), // hour  
        "m+": this.getMinutes(), // minute  
        "s+": this.getSeconds(), // second  
        "q+": Math.floor((this.getMonth() + 3) / 3), // quarter  
        "S": this.getMilliseconds()  
        // millisecond  
    }  
    if (/(y+)/.test(format))  
        format = format.replace(RegExp.$1, (this.getFullYear() + "")  
            .substr(4 - RegExp.$1.length));  
    for (var k in o)  
        if (new RegExp("(" + k + ")").test(format))  
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));  
    return format;  
}  
 
function formatDatebox(value) {  
    if (value == null || value == '') {  
        return '';  
    }  
    var dt;  
    if (value instanceof Date) {  
        dt = value;  
    } else {  
        dt = new Date(value);  
    }  
  
    return dt.format("yyyy-MM-dd"); //扩展的Date的format方法(上述插件实现)  
} 

function formatDateYmdHms(value){
	if (value == null || value == '') {  
        return '';  
    }  
    var dt;  
    if (value instanceof Date) {  
        dt = value;  
    } else {  
        dt = new Date(value);  
    }  
  
    return dt.format("yyyy-MM-dd hh:mm:ss"); //扩展的Date的format方法(上述插件实现)  
}

function getRowIndex(target){
    var tr = $(target).closest('tr.datagrid-row');
    return parseInt(tr.attr('datagrid-row-index'));
}

$.extend($.fn.datagrid.defaults.editors, {
	button: {//colorpicker就是你要自定义editor的名称
        init: function (container, options) {
            var editorContainer = $("<div/>");
            var button = $("<a href='javascript:void(0)' onclick='aUpload(this)'>"+options.title+"</a>").linkbutton({plain:true});
            editorContainer.append(button);  
            editorContainer.appendTo(container);  
            return button;  
        },
        getValue: function (target) {
            return $(target).val();
        },
        setValue: function (target, value) {
            $(target).val(value);
            $(target).css('backgroundColor', value);
        },
        resize: function (target, width) {
            var input = $(target);
            if ($.boxModel == true) {
                input.width(width - (input.outerWidth() - input.width()));
            } else {
                input.width(width);
            }
        }
    },
	numberspinner:{
		init:function(container,options){
			var input = $("<input type='text'>").appendTo(container);
			return input.numberspinner(options);
		},
		destroy:function(target){
			$(target).numberspinner('destroy');
		},
		getValue:function(target){
			return $(target).numberspinner('getValue');
		},
		setValue:function(target,value){
			$(target).numberspinner('setValue',value);
		},
		resize:function(target,width){
			$(target).numberspinner('resize',width);
		}
	},
	datetimebox:{
		init:function(container,options){
			var editor = $("<input />").appendTo(container);
			editor.datetimebox(options);
			return editor;
		},
		getValue:function(target){
			var newStr = $(target).datetimebox('getValue').replace(/:/g,'-');
			newStr = newStr.replace(/ /g,'-');
			var arr = newStr.split("-");
			var dateNum = new Date(Date.UTC(arr[0],arr[1]-1,arr[2],arr[3]-8,arr[4],arr[5]));
			var timeStamp = dateNum.getTime();
			return formatDateYmdHms(timeStamp);
		},
		setValue:function(target,value){
			console.log(formatDateYmdHms(value));
			$(target).datetimebox('setValue',formatDateYmdHms(value));
		},
		resize:function(target,width){
			$(target).datetimebox('resize',width);
		},
		destory:function(target){
			$(target).datetimebox('destroy');
		}
	}
});
function isEmpty(value) {
  return (Array.isArray(value) && value.length === 0) 
      || (Object.prototype.isPrototypeOf(value) && Object.keys(value).length === 0);
}
