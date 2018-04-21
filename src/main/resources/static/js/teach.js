//$('option').on('click',function(){$('.myIframe').attr('第一周','<%=basePath%>/view/teach_lab/teach_lab.jsp?title='+encodeURI($(this).text()));});
//$('option').on('click',function(){$('.myIframe').attr('第二周','<%=basePath%>/view/teach_lab02/teach_lab02.jsp?title='+encodeURI($(this).text()));});
//$('option').on('click',function(){$('.myIframe').attr('第三周','<%=basePath%>/view/teach_lab03/teach_lab03.jsp?title='+encodeURI($(this).text()));});
//$('option').on('click',function(){$('.myIframe').attr('第四周','<%=basePath%>/view/teach_lab04/teach_lab04.jsp?title='+encodeURI($(this).text()));});
//function menu_01() {
	//  window.open('<%=basePath%>/view/teach_lab/teach_lab.jsp','_top');
	//}
	//function menu_02() {
	//  window.open('<%=basePath%>/view/teach_lab02/teach_lab02.jsp','_top');
	//}
	//function menu_03() {
	//  window.open('http://www.sina.com.cn','_top');
	//}
function labsel(targ,selObj,restore){
	eval(targ+".location='"+selObj.options[selObj.selectedIndex].value+"'");
    if (restore) selObj.selectedIndex=0;
}

