function onclickButton() {
	$("#addJuhuasuanUrl_id").click(function() {
		$.layer({
			type : 2,
			title : '链接操作',
			shadeClose : true,
			maxmin : true,
			fix : false,
			// area: ['1024px', 500],
			area : [ '1024px', ($(window).height() - 50) + 'px' ],
			close : function(index) {
				reload();
			},
			iframe : {
				src : basepath + '/usertb/addJuhuasuanUrlView'
			}
		});
	});

	$("#batchAddJuhuasuanUrl_id3").click(function() {
		$.layer({
			type : 2,
			title : '批量导入链接',
			shadeClose : true,
			maxmin : true,
			fix : false,
			// area: ['1024px', 500],
			area : [ '1024px', ($(window).height() - 50) + 'px' ],
			close : function(index) {
				reload();
			},
			iframe : {
				src : basepath + '/usertb/uploadUrlView'
			}
		});
	});

	$("#searchBeanButton").click(function() {
		$("#searchBeanForm").submit();
	});
}

$(document).ready(function() {
	onclickButton();
});

function reload(index) {
	// 当前页面重新刷新
	document.location.reload();
}
function juhuasuanSeachLoading(pageNo) {
	/**
	 * 设置值
	 */
	$("input#pageNo").val(pageNo);
	$("#searchBeanCopyForm").submit();
}

function reviewTheUrl(code) {
	$.layer({
		type : 2,
		title : '链接操作',
		shadeClose : true,
		maxmin : true,
		fix : false,
		area : [ '1024px', ($(window).height() - 50) + 'px' ],
		close : function(index) {
			reload();
		},
		iframe : {
			src : basepath + '/usertb/juhuasuanUrlView?code=' + code
		}
	});
}
function modifyTheUrl(code) {
	$.layer({
		type : 2,
		title : '链接操作',
		shadeClose : true,
		maxmin : true,
		fix : false,
		area : [ '1024px', ($(window).height() - 50) + 'px' ],
		close : function(index) {
			reload();
		},
		iframe : {
			src : basepath + '/usertb/modifyJuhusuanUrlView?code=' + code
		}
	});
}

function deleteTheUrl(code) {
	var tip = "确定要 删除该链接？"
	$.layer({
		shade : [ 0 ],
		area : [ 'auto', 'auto' ],
		dialog : {
			msg : tip,
			btns : 2,
			type : 4,
			btn : [ '确定', '取消' ],
			yes : function() {
				var data = {
					code : code
				};
				$.getJSON(basepath + "/usertb/deleteTUrl", data, function(data) {
					layer.msg(data.tip, 1, 1);
					reload();
				});
			},
			no : function() {
			}
		}
	});
}
