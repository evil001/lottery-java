<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1元云购 - 惊喜无限!</title>
<link rel="stylesheet" href="/resources/css/head.css" />
<link rel="stylesheet" href="/resources/css/index.css" />
<script type="text/javascript" src="/resources/js/third/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="/resources/js/common/bottom.js"></script>
<script type="text/javascript" src="/resources/js/index/index.js"></script>
<script type="text/javascript" src="/resources/js/common/common.js"></script>
<script type="text/javascript" src="/resources/js/common/cart_common.js"></script>
<script type="text/javascript" src="/resources/js/common/ajax_page.js"></script>
<script type="text/javascript" src="/resources/js/common/parabola.js"></script>
<script type="text/javascript" src="/resources/js/lottery/lottery.js"></script>
</head>
<body id="loadingPicBlock" class="home" rf="1">

    <div class="wrapper">
        <!--top-->
        <jsp:include page="../../../common/top.jsp"/>
        <!-- header -->
        <jsp:include page="../../../common/header.jsp"/>
      	<!--导航-->
        <jsp:include page="../../../common/nav.jsp"/>         
        <!--内容-->
        <div class="g-content clrfix">
            <div class="w1190">
                <div class="home-banner fl">
                    <div id="div_slide" class="slide-scroll">
                        <div id="div_guide" class="m-guide-con" style="display: none;">
                            <div class="m-guideBg"></div>
                            <div class="m-guide">
                                <ul id="ul_guide">
                                    <li class="f-step1"><a href="javascript:;" title="30秒了解"></a>
                                        <img src="http://skin.1yyg.com/images/step_01.gif?v=141113"></li>
                                    <li class="f-step2" style="display: none;"><a href="javascript:;" title="下一步"></a>
                                        <img src="http://skin.1yyg.com/images/step_02.gif?v=141113"></li>
                                    <li class="f-step3" style="display: none;"><a href="javascript:;" title="下一步"></a>
                                        <img src="http://skin.1yyg.com/images/step_03.gif?v=141113"></li>
                                    <li class="f-step4" style="display: none;"><a href="javascript:;" title="下一步"></a>
                                        <img src="http://skin.1yyg.com/images/step_04.gif?v=141113"></li>
                                    <li class="f-step5" style="display: none;"><a href="javascript:;" title="下一步"></a>
                                        <img src="http://skin.1yyg.com/images/step_05.gif?v=141113"></li>
                                    <li class="f-step6" style="display: none;"><a href="http://help.1yyg.com/info/newbie/index.html" target="_blank" title="继续了解详情"></a>
                                        <img src="http://skin.1yyg.com/images/step_06.gif?v=141113"></li>
                                </ul>
                                <a id="guide_close" href="javascript:;" class="m-guide-close" title="关闭"></a>
                            </div>
                            <div class="u-guide-arrow">
                                <a id="guide_pre" href="javascript:;" class="u-guide-prev"><s></s></a>
                                <a id="guide_next" href="javascript:;" class="u-guide-next"><s></s></a>
                            </div>
                        </div>
                        <div class="pic-wrapper">
                            <div class="slide-scroll-con">
                                <ul id="slideImg">
                                	<li style="opacity: 0; z-index: 0;">
                                		<a href="http://www.1yyg.com/list/i305.html" target="_blank">
                                			<img src="http://img.1yyg.com/Poster/20161010175549998.jpg" alt="" width="709" height="300">
                                		</a>
                                	</li>
                                	<li style="opacity: 0; z-index: 0;">
                                		<a href="http://www.1yyg.com/list/i252b835.html" target="_blank">
                                			<img src="http://img.1yyg.com/Poster/20161010153923929.jpg" alt="" width="709" height="300">
                                		</a>
                                	</li>
                                	<li style="opacity: 0; z-index: 0;">
                                		<a href="http://www.1yyg.com/list/i3b8.html" target="_blank">
                                			<img src="http://img.1yyg.com/Poster/20161010153800319.jpg" alt="" width="709" height="300">
                                		</a>
                                	</li>
                                	<li style="opacity: 0; z-index: 0;">
                                		<a href="http://www.1yyg.com/search/?q=iphone7" target="_blank">
                                			<img src="http://img.1yyg.com/Poster/20160908134451332.jpg" alt="" width="709" height="300">
                                		</a>
                                	</li>
                                	<li style="opacity: 1; z-index: 1;">
                                		<a href="http://info.1yyg.com/ztCart/" target="_blank">
                                			<img src="http://img.1yyg.com/Poster/20150727112026494.jpg" alt="车落谁家？请您来见证！" width="709" height="300">
                                		</a>
                                	</li>
                                </ul>
                            </div>
                        </div>
                        <div class="i-ctrl">
                            <a id="ctrl_prev" href="javascript:;" class="ctrl-prev" style="display: none;"><s></s></a>
                            <a id="ctrl_next" href="javascript:;" class="ctrl-next" style="display: none;"><s></s></a>
                        </div>
                        <div class="handle-box">
                            <ul id="handle_box"><li class=""><a href="javascript:;"></a></li><li class=""><a href="javascript:;"></a></li><li class=""><a href="javascript:;"></a></li><li class=""><a href="javascript:;"></a></li><li class="hover"><a href="javascript:;"></a></li></ul>
                        </div>
                    </div>

                    <!--广告位下方推荐-->
                    <div class="slide-comd">
                        
                        
                                <div class="commodity">
                                    <ul>
                                        <li class="comm-info fl">
                                            <span><a href="http://www.1yyg.com/products/23419.html" target="_blank" title="奥迪（Audi）A6L 2016款 30 FSI 舒适型轿车">奥迪（Audi）A6L 2016款 30 FSI 舒适型轿车</a></span>
                                            <p class="gray">已参与<em class="orange">156246</em>人次</p>
                                        </li>
                                        <li class="comm-pic fr"><a href="http://www.1yyg.com/products/23419.html" target="_blank" title="奥迪（Audi）A6L 2016款 30 FSI 舒适型轿车" rel="nofollow">
                                            <cite>
                                                <img alt="奥迪（Audi）A6L 2016款 30 FSI 舒适型轿车" src="http://goodsimg.1yyg.com/GoodsPic/pic-200-200/20160816175429832.jpg" border="0" width="100" height="100"></cite>
                                            
                                        </a>
                                        </li>
                                    </ul>
                                </div>
                            
                                <div class="commodity">
                                    <ul>
                                        <li class="comm-info fl">
                                            <span><a href="http://www.1yyg.com/products/23455.html" target="_blank" title="苹果（Apple）iPhone 7 32G版 4G手机">苹果（Apple）iPhone 7 32G版 4G手机</a></span>
                                            <p class="gray">已参与<em class="orange">485</em>人次</p>
                                        </li>
                                        <li class="comm-pic fr"><a href="http://www.1yyg.com/products/23455.html" target="_blank" title="苹果（Apple）iPhone 7 32G版 4G手机" rel="nofollow">
                                            <cite>
                                                <img alt="苹果（Apple）iPhone 7 32G版 4G手机" src="http://goodsimg.1yyg.com/GoodsPic/pic-200-200/20160908092706997.jpg" border="0" width="100" height="100"></cite>
                                            
                                        </a>
                                        </li>
                                    </ul>
                                </div>
                            
                    </div>
                </div>
                <div class="home-event fr">
                    <div class="what-1yyg">
                        <a id="what_1yyg" href="javascript:void(0);" title="什么是1元云购？30秒了解">
                            <img src="http://skin.1yyg.com/images/index-come.gif" alt=""></a>
                    </div>
                    <div class="honesty">
                        <ul>
                            <li><a href="http://info.1yyg.com/sincerity/index.html" target="_blank" title="诚信网站"><i class="i1"></i>诚信网站</a></li>
                            <li><a href="http://info.1yyg.com/sincerity/index.html#rz2" target="_blank" rel="nofollow" title="可信网站"><i class="i2"></i>可信网站</a></li>
                            <li><a href="http://info.1yyg.com/sincerity/index.html#rz3" target="_blank" rel="nofollow" title="电商诚信"><i class="i3"></i>电商诚信</a></li>
                            <li><a href="http://info.1yyg.com/sincerity/index.html#rz5" target="_blank" rel="nofollow" title="监督管理局"><i class="i5"></i>监督管理局</a></li>
                            <li><a href="http://info.1yyg.com/sincerity/index.html#rz4" target="_blank" rel="nofollow" title="服务保证"><i class="i4"></i>服务保证</a></li>
                            <li><a href="http://info.1yyg.com/sincerity/index.html" target="_blank" rel="nofollow" title="更多"><i class="i6"></i>更多</a></li>
                        </ul>
                    </div>
                    <div class="index_news clrfix">
                        <dl>
                            <dt><a href="http://group.1yyg.com/group-1.html" target="_blank" title="云购公告">云购公告</a></dt>
                            
                            
                                    <dd class=""><b></b><a href="http://group.1yyg.com/topic-16936.html" target="_blank" title="1元云购Galaxy Note7召回公告">1元云购Galaxy Note7召回公告</a></dd>
                                
                                    <dd class=""><b></b><a href="http://group.1yyg.com/topic-16696.html" target="_blank" title="1元云购致社会公开信">1元云购致社会公开信</a></dd>
                                
                                    <dd class=""><b></b><a href="http://group.1yyg.com/topic-15823.html" target="_blank" title="关于微信支付暂停使用公告">关于微信支付暂停使用公告</a></dd>
                                
                        </dl>
                    </div>
                </div>
            </div>
        </div>

        <div class="g-wrap w1190">
            <!--最新揭晓-->
            <div class="g-title">
                <h3 class="fl"><i></i>最新揭晓</h3>
                <div class="m-other fl">
                    <a href="http://www.1yyg.com/map.html" target="_blank" title="看看附近都有谁获得了商品？"><em></em>看看附近都有谁获得了商品？</a>
                </div>
                <div class="fr z-total">
                    <a href="/lottery/m1.html" target="_blank">共揭晓商品&nbsp;<em id="em_lotcount" class="orange">7664793</em>&nbsp;个&nbsp;<i class="f-tran">&gt;&gt;</i></a>
                </div>
            </div>
            <div class="g-list clrfix" style="border-left-style: none; border-right-style: none; width: 1190px;">
                
                <ul id="ul_Lottery" style="width: 1589px; margin-left: 0px;"><li id="8738453" class="current"><dl class="m-in-progress"><dt><a href="product/8738453.html" target="_blank" title="可口可乐 汽水 330mlx24听 整箱装"><img alt="可口可乐 汽水 330mlx24听 整箱装" src="http://goodsimg.1yyg.com/goodspic/pic-200-200/20160826112503290.jpg"></a></dt><dd class="u-name"><a href="product/8738453.html" title="(第12019云)可口可乐 汽水 330mlx24听 整箱装">(第12019云)可口可乐 汽水 330mlx24听 整箱装</a></dd><dd class="gray">价值：￥58.00</dd><dd class="u-time" id="dd_time"><em>揭晓倒计时</em><span><b>02</b> : <b>53</b> : <b><i>1</i><i>7</i></b></span></dd></dl><s class="transparent-png"></s></li><li id="8894140" class="current"><dl class="m-in-progress"><dt><a href="product/8894140.html" target="_blank" title="加多宝 凉茶 310mlx12罐 整箱装"><img alt="加多宝 凉茶 310mlx12罐 整箱装" src="http://goodsimg.1yyg.com/goodspic/pic-200-200/20160418162459140.jpg"></a></dt><dd class="u-name"><a href="product/8894140.html" title="(第71155云)加多宝 凉茶 310mlx12罐 整箱装">(第71155云)加多宝 凉茶 310mlx12罐 整箱装</a></dd><dd class="gray">价值：￥49.00</dd><dd class="u-time" id="dd_time"><em>揭晓倒计时</em><span><b>02</b> : <b>45</b> : <b><i>9</i><i>2</i></b></span></dd></dl><s class="transparent-png"></s></li><li id="8933409" class="current"><dl class="m-in-progress"><dt><a href="product/8933409.html" target="_blank" title="蓝月亮 亮白增艳洗衣液（自然清香）3kg/瓶"><img alt="蓝月亮 亮白增艳洗衣液（自然清香）3kg/瓶" src="http://goodsimg.1yyg.com/goodspic/pic-200-200/20150703172947616.jpg"></a></dt><dd class="u-name"><a href="product/8933409.html" title="(第23746云)蓝月亮 亮白增艳洗衣液（自然清香）3kg/瓶">(第23746云)蓝月亮 亮白增艳洗衣液（自然清香）3kg/瓶</a></dd><dd class="gray">价值：￥52.00</dd><dd class="u-time" id="dd_time"><em>揭晓倒计时</em><span><b>02</b> : <b>44</b> : <b><i>1</i><i>5</i></b></span></dd></dl><s class="transparent-png"></s></li><li id="8922865" class="current"><dl class="m-in-progress"><dt><a href="product/8922865.html" target="_blank" title="苹果（Apple）iPhone 6s 32G版 4G手机"><img alt="苹果（Apple）iPhone 6s 32G版 4G手机" src="http://goodsimg.1yyg.com/goodspic/pic-200-200/20160926172337982.jpg"></a></dt><dd class="u-name"><a href="product/8922865.html" title="(第24657云)苹果（Apple）iPhone 6s 32G版 4G手机">(第24657云)苹果（Apple）iPhone 6s 32G版 4G手机</a></dd><dd class="gray">价值：￥4548.00</dd><dd class="u-time" id="dd_time"><em>揭晓倒计时</em><span><b>02</b> : <b>43</b> : <b><i>1</i><i>5</i></b></span></dd></dl><s class="transparent-png"></s></li><li id="8906024" class="current current2"><dl class="m-in-progress"><dt><a href="product/8906024.html" target="_blank" title="悠骑（JQ）新悠美款 12寸锂电折叠电动车自行车"><img alt="悠骑（JQ）新悠美款 12寸锂电折叠电动车自行车" src="http://goodsimg.1yyg.com/goodspic/pic-200-200/20160518134132605.jpg"></a></dt><dd class="u-name"><a href="product/8906024.html" title="(第888云)悠骑（JQ）新悠美款 12寸锂电折叠电动车自行车">(第888云)悠骑（JQ）新悠美款 12寸锂电折叠电动车自行车</a></dd><dd class="gray">价值：￥2499.00</dd><dd class="u-time" id="dd_time"><em>揭晓倒计时</em><span><b>02</b> : <b>40</b> : <b><i>1</i><i>5</i></b></span></dd></dl><s class="transparent-png"></s></li>
                    
                            
                        
                            
                        
                            
                        
                            
                        
                            
                        
                </ul>
            </div>

            <!--热门推荐-->
            <div class="g-title">
                <h3 class="fl"><i></i>热门推荐</h3>
                <div class="m-other fr">
                    <a href="http://www.1yyg.com/list/m1.html?r=20" target="_blank" title="更多" class="u-more">更多</a>
                </div>
            </div>
            <div class="g-hot clrfix">
                <div class="g-hotL fl" id="divHotGoodsList">
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                    <div class="g-hotL-list">
                        <div class="g-hotL-con">
                            <div class="u-loading"><em></em></div>
                        </div>
                    </div>
                </div>
                <div class="g-hotR fr">
                    <div class="u-are">正在云购</div>
                    <div class="g-zzyging">
                        <input name="hidBuyID" type="hidden" id="hidBuyID" value="848362008">
                        <ul id="UserBuyNewList">
                            
                            
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1012255018" target="_blank" rel="nofollow" title="为什么不中中中中中啊">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/00000000000000000.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1012255018" target="_blank" title="为什么不中中中中中啊" class="blue">为什么不中中中中中啊</a><br>
                                            <a href="http://www.1yyg.com/product/8897471.html" target="_blank" title="北京现代 索纳塔八 2015款 经典 2.4L 自动领先版" class="u-ongoing">北京现代 索纳塔八 2015款 经典 2.4L 自动领先版</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1016694640" target="_blank" rel="nofollow" title="不能黑博远佳多宝">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20161027133528774.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1016694640" target="_blank" title="不能黑博远佳多宝" class="blue">不能黑博远佳多宝</a><br>
                                            <a href="http://www.1yyg.com/product/8933285.html" target="_blank" title="平安银行 招财进宝金章 Au9999 5g" class="u-ongoing">平安银行 招财进宝金章 Au9999 5g</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1011367293" target="_blank" rel="nofollow" title="USER.1011367293">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20151123141212794.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1011367293" target="_blank" title="USER.1011367293" class="blue">USER.1011367293</a><br>
                                            <a href="http://www.1yyg.com/product/8630806.html" target="_blank" title="苹果（Apple）iMac MK142CH/A 21.5英寸一体电脑" class="u-ongoing">苹果（Apple）iMac MK142CH/A 21.5英寸一体电脑</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1016315621" target="_blank" rel="nofollow" title="操云购骗子没得玩">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/00000000000000000.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1016315621" target="_blank" title="操云购骗子没得玩" class="blue">操云购骗子没得玩</a><br>
                                            <a href="http://www.1yyg.com/product/8933409.html" target="_blank" title="蓝月亮 亮白增艳洗衣液（自然清香）3kg/瓶" class="u-ongoing">蓝月亮 亮白增艳洗衣液（自然清香）3kg/瓶</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1016999432" target="_blank" rel="nofollow" title="噢0000000">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20161017203511875.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1016999432" target="_blank" title="噢0000000" class="blue">噢0000000</a><br>
                                            <a href="http://www.1yyg.com/product/8933285.html" target="_blank" title="平安银行 招财进宝金章 Au9999 5g" class="u-ongoing">平安银行 招财进宝金章 Au9999 5g</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1016315621" target="_blank" rel="nofollow" title="操云购骗子没得玩">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/00000000000000000.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1016315621" target="_blank" title="操云购骗子没得玩" class="blue">操云购骗子没得玩</a><br>
                                            <a href="http://www.1yyg.com/product/8789255.html" target="_blank" title="3M DWS2500-CN 全效型家用净水器" class="u-ongoing">3M DWS2500-CN 全效型家用净水器</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1014501887" target="_blank" rel="nofollow" title="狠草云购全家小咪咪Z">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20160714200932815.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1014501887" target="_blank" title="狠草云购全家小咪咪Z" class="blue">狠草云购全家小咪咪Z</a><br>
                                            <a href="http://www.1yyg.com/product/8850590.html" target="_blank" title="苹果（Apple）iPhone 7 Plus 128G版 4G手机" class="u-ongoing">苹果（Apple）iPhone 7 Plus 128G版 4G手机</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1015717200" target="_blank" rel="nofollow" title="零零玖又回来了">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20161027143822740.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1015717200" target="_blank" title="零零玖又回来了" class="blue">零零玖又回来了</a><br>
                                            <a href="http://www.1yyg.com/product/8905690.html" target="_blank" title="旺旺 旺仔牛奶 原味 245mlx12罐 礼盒装" class="u-ongoing">旺旺 旺仔牛奶 原味 245mlx12罐 礼盒装</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1016960679" target="_blank" rel="nofollow" title="鹏哥-失忆那苹果">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20161006104748887.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1016960679" target="_blank" title="鹏哥-失忆那苹果" class="blue">鹏哥-失忆那苹果</a><br>
                                            <a href="http://www.1yyg.com/product/8922865.html" target="_blank" title="苹果（Apple）iPhone 6s 32G版 4G手机" class="u-ongoing">苹果（Apple）iPhone 6s 32G版 4G手机</a>
                                        </p>
                                    </li>
                                
                                    <li>
                                        <span class="fl"><a href="http://u.1yyg.com/1015524514" target="_blank" rel="nofollow" title="云购你个狼食的死骗子">
                                            <img alt="" src="http://faceimg.1yyg.com/UserFace/20161005155317504.jpg"><i class="transparent-png"></i></a></span>
                                        <p>
                                            <a href="http://u.1yyg.com/1015524514" target="_blank" title="云购你个狼食的死骗子" class="blue">云购你个狼食的死骗子</a><br>
                                            <a href="http://www.1yyg.com/product/8928420.html" target="_blank" title="平安银行 平安金福金条 Au9999 50g" class="u-ongoing">平安银行 平安金福金条 Au9999 50g</a>
                                        </p>
                                    </li>
                                
                        </ul>
                    </div>
                    <div class="u-see100"><a href="http://www.1yyg.com/newestBuyRecords.html" target="_blank">查看最新100条记录</a></div>
                </div>
            </div>

            <!--即将揭晓-->
            <div class="g-title m-sort">
                <h3 class="fl"><i></i>即将揭晓</h3>
                <div class="fr">
                    <a href="http://www.1yyg.com/list/i100.html" target="_blank" title="手机数码">手机数码</a>
                    <a href="http://www.1yyg.com/list/i106.html" target="_blank" title="电脑办公">电脑办公</a>
                    <a href="http://www.1yyg.com/list/i104.html" target="_blank" title="家用电器">家用电器</a>
                    <a href="http://www.1yyg.com/list/i2.html" target="_blank" title="化妆个护">化妆个护</a>
                    <a href="http://www.1yyg.com/list/i222.html" target="_blank" title="钟表首饰">钟表首饰</a>
                    <a href="http://www.1yyg.com/list/i312.html" target="_blank" title="其他商品">其他商品</a>
                    <a href="http://www.1yyg.com/list/m1.html" target="_blank" title="全部">全部</a>
                </div>
            </div>
            <div class="announced-soon clrfix" id="divSoonGoodsList">
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
            </div>
            <div class="check-out"><a href="http://www.1yyg.com/list/m1.html" target="_blank" title="查看所有商品">查看所有商品</a></div>

            <!--新品上架-->
            <div class="g-title">
                <h3 class="fl"><i></i>新品上架</h3>
                <div class="m-other fr">
                    <a href="http://www.1yyg.com/list/m1.html?r=50" target="_blank" title="更多" class="u-more">更多</a>
                </div>
            </div>
            <div class="announced-soon clrfix announced-soon-new" id="divNewGoodsList">
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
                <div class="soon-list-con">
                    <div class="soon-list">
                        <div class="u-loading"><em></em></div>
                    </div>
                </div>
            </div>

            <!--晒单分享-->
            <div class="g-title">
                <h3 class="fl"><i></i>晒单分享</h3>
                <div class="m-other fr">
                    <a href="http://post.1yyg.com/" target="_blank" title="更多" class="u-more">更多</a>
                </div>
            </div>
            <div class="g-single-sun">
                <div class="singleL fl" id="divPostRec">
                    <div class="u-loading"><em></em></div>
                </div>
                <div class="singleR fl">
                    <ul id="ul_PostList">
                        <li>
                            <div class="u-loading"><em></em></div>
                        </li>
                        <li>
                            <div class="u-loading"><em></em></div>
                        </li>
                        <li>
                            <div class="u-loading"><em></em></div>
                        </li>
                        <li>
                            <div class="u-loading"><em></em></div>
                        </li>
                        <li>
                            <div class="u-loading"><em></em></div>
                        </li>
                        <li>
                            <div class="u-loading"><em></em></div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <!--底部-->
        <!--底部-->
      <div class="g-footer">
          <div class="w1190">
              <div class="g-guide clrfix">
                  <dl>
                      <dt>新手指南</dt>
                      <dd><a target="_blank" href="http://help.1yyg.com/" title="了解1元云购">了解1元云购</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-questiondetail.html" title="常见问题">常见问题</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-userExperience.html" title="福分等级介绍">福分等级介绍</a></dd>
                  </dl>
                  <dl>
                      <dt>云购保障</dt>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-genuinetwo.html" title="1元云购保障体系">1元云购保障体系</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-securepayment.html" title="安全支付">安全支付</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-suggestion.html" title="投诉建议">投诉建议</a></dd>
                  </dl>
                  <dl>
                      <dt>商品配送</dt>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-deliveryfees.html" title="配送费用">配送费用</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-prodcheck.html" title="商品验货与签收">商品验货与签收</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-shiptwo.html" title="长时间未收到商品">长时间未收到商品</a></dd>
                  </dl>
                  <dl>
                      <dt>关于1元云购</dt>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-about.html" title="1元云购介绍">1元云购介绍</a></dd>
                      <dd><a target="_blank" href="http://info.1yyg.com/fund/" title="云购公益">云购公益</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/htm-contactus.html" title="联系我们">联系我们</a></dd>
                  </dl>
                  <dl>
                      <dt>携手1元云购</dt>
                      <dd><a target="_blank" href="http://help.1yyg.com/info/htm-business.html" title="商务合作">商务合作</a></dd>
                      <dd><a target="_blank" href="http://member.1yyg.com/ReferAuth.do" title="邀请">邀请</a></dd>
                      <dd><a target="_blank" href="http://help.1yyg.com/info/htm-qqgroup.html" title="官方QQ群交流">官方QQ群交流</a></dd>
                  </dl>
              </div>
      
              <div class="g-service">
                  <div class="m-ser u-ser1">
                      <ul>
                          <li><s class="u-icons"></s></li>
                          <li>
                              <dl>
                                  <dt>下载手机客户端</dt>
                                  <dd><b class="u-icons"></b></dd>
                                  <dd><a target="_blank" href="http://info.1yyg.com/app/mobile.html" title="立即下载">立即下载</a></dd>
                              </dl>
                          </li>
                      </ul>
                  </div>
                  <div class="m-ser u-ser2">
                      <ul>
                          <li><a href="javascript:;">
                              <img src="http://skin.1yyg.com/images/1yyg-wx.png?v=20141105"></a></li>
                          <li>
                              <dl>
                                  <dt><a target="_blank" href="http://info.1yyg.com/app/microchannel.html"><i class="u-icons"></i>关注官方微信</a></dt>
                                  <dd><a target="_blank" href="http://info.1yyg.com/app/microchannel.html"><b class="u-icons"></b></a></dd>
                              </dl>
                          </li>
                      </ul>
                  </div>
                  <div class="m-ser u-ser3">
                      <ul>
                          <li><s class="u-icons"></s></li>
                          <li>
                              <dl>
                                  <dt>服务器时间</dt>
                                  <dd id="pServerTime">
                                      <span>15</span>
                                      <em>:</em>
                                      <span>38</span>
                                      <em>:</em>
                                      <span>57</span>
                                  </dd>
                              </dl>
                          </li>
                      </ul>
                  </div>
                  <div class="m-ser u-ser4">
                      <ul>
                          <li><s class="u-icons"></s></li>
                          <li>
                              <dl>
                                  <dt>云购公益基金</dt>
                                  <dd><a target="_blank" href="http://info.1yyg.com/fund/" id="spFundTotal">￥124912226.74</a></dd>
                              </dl>
                          </li>
                      </ul>
                  </div>
                  <div class="m-ser u-ser5">
                      <ul>
                          <li><s class="u-icons"></s></li>
                          <li>
                              <dl>
                                  <dt>服务热线</dt>
                                  <dd class="orange u-tel">4000-588-688</dd>
                                  <dd><a id="btnBtmQQ" href="javascript:;" class="u-service u-service-on" title="在线客服"><i></i>在线客服</a></dd>
                              </dl>
                          </li>
                      </ul>
                  </div>
              </div>
      
              <div class="g-special clrfix">
                  <ul>
                      <li>
                          <a href="http://help.1yyg.com/htm-genuinetwo.html" target="_blank" title="100%公平公正">
                              <em class="u-spc-icon1"></em>
                              <span>100%公平公正</span>
                              参与过程公开透明，用户可随时查看
                          </a>
                      </li>
                      <li>
                          <a href="http://help.1yyg.com/htm-genuine.html" target="_blank" title="100%正品保证">
                              <em class="u-spc-icon2"></em>
                              <span>100%正品保证</span>
                              精心挑选优质商家，100%品牌正品
                          </a>
                      </li>
                      <li>
                          <a href="http://help.1yyg.com/htm-deliveryfees.html" target="_blank" title="全国免运费">
                              <em class="u-spc-icon3"></em>
                              <span>全国免运费</span>
                              全国包邮（港澳台及特殊商品除外）
                          </a>
                      </li>
                  </ul>
              </div>
          </div>
      </div><!--版权-->
          <div class="g-copyrightCon clrfix">
                     <div class="w1190">
                         <div class="g-links">
                             <a href="http://www.1yyg.com/" target="_blank" title="首页">首页</a><s></s>
                             <a href="http://help.1yyg.com/htm-about.html" target="_blank" title="关于云购">关于云购</a><s></s>
                             <a href="http://help.1yyg.com/htm-privacy.html" target="_blank" title="隐私声明">隐私声明</a><s></s>
                             <a href="http://help.1yyg.com/info/htm-business.html" target="_blank" title="合作专区">合作专区</a><s></s>
                             <a href="http://www.1yyg.com/link.html" target="_blank" title="友情链接">友情链接</a><s></s>
                             <a href="http://help.1yyg.com/htm-jobs.html" target="_blank" title="加入云购">加入云购</a><s></s>
                             <a href="http://help.1yyg.com/htm-contactus.html" target="_blank" title="联系我们">联系我们</a>
                         </div>
                         <div class="g-copyright">Copyright © 2011 - 2016, 版权所有 1yyg.com 粤ICP备09213115号-1</div>
                         <div class="g-authentication">
                             <a href="http://www.1yyg.com/url.html?t=7" target="_blank" class="fi_ectrustchina"></a>
                             <a href="http://www.1yyg.com/url.html?t=1" target="_blank" class="fi_315online"></a>
                             <a href="http://www.1yyg.com/url.html?t=2" target="_blank" class="fi_qh"></a>
                             <a href="http://www.1yyg.com/url.html?t=3" target="_blank" class="fi_cnnic"></a>
                             <a href="http://www.1yyg.com/url.html?t=6" target="_blank" class="fi_anxibao" style="display:none;"></a>
                             <a href="http://www.1yyg.com/url.html?t=4" target="_blank" class="fi_pingan"></a>
                             <a href="http://www.1yyg.com/url.html?t=8" target="_blank" class="fi_yangshi"></a>
                         </div>
                     </div>
                 </div>
          <!--通栏购物车-->
          <div id="rightTool" class="g-outer" style="display: block; right: 0px;">
              <div class="g-status-standard" style="height: 550px;">
                  <div class="m-banner-list">
                      <div class="u-sentence" style="height: 0px;">
                          <span style="background-image: none;"></span>
                          <cite><a href="javascript:;"><!--<img src="../images/banner.jpg">--></a></cite>
                      </div>
                      <div class="u-shortcut u-gwc-ygjl">
                          <ul>
                              <li class="f-shopping-cart">
                                  <div class="u-float-list">
                                      <a href="http://cart.1yyg.com/CartList.do" target="_blank">
                                          <s class="z-clump-icon"></s>
                                          <em>1</em>
                                          <span>购物车</span>
                                      </a>
                                      <b class="curr-arrow"></b>
                                  </div>
                              </li>
    						 
                          </ul>
                      </div>
                      <div class="u-shortcut u-icon-con">
                          <ul>
   					    <li class="f-pur-records">
                            	<div class="u-float-list">
                                	<a href="http://member.1yyg.com/UserBuyList.do" target="_blank">
                                        <i class="z-clump-icon"></i>
                                        <cite>云购记录</cite>
                                    </a>
                                    <b class="curr-arrow"></b>
                                </div>
                            </li>
                              <li class="f-client">
                                  <div class="u-float-list">
                                      <a href="http://info.1yyg.com/app/mobile.html" target="_blank">
          	                            <i class="z-clump-icon"></i>
          	                        </a>
                                      <b class="curr-arrow"></b>
                                  </div>
                                  <div class="u-activate">
                                      <a href="http://info.1yyg.com/app/mobile.html" target="_blank">
                                          <img src="http://skin.1yyg.com/images/andriod.jpg?v=20141105">
                                      </a>
                                  </div>
                              </li>
                              <li class="f-weixin">
                                  <div class="u-float-list">
                                      <a href="http://info.1yyg.com/app/microchannel.html" target="_blank">
          	                            <i class="z-clump-icon"></i>
          	                        </a>
                                      <b class="curr-arrow"></b>
                                  </div>
                                  <div class="u-activate">
                                      <a href="http://info.1yyg.com/app/microchannel.html" target="_blank">
                                          <img src="http://skin.1yyg.com/images/1yyg-wx.png?v=20141105">
                                          关注官方微信
                                      </a>
                                  </div>
                              </li>
                              <li class="f-customer-service">
                                  <div class="u-float-list">
                                      <a id="btnRigQQ" href="javascript:;" class="z-customer-on" title="在线客服">
          	                            <i class="z-clump-icon"></i><cite>在线客服</cite>
          	                        </a>
                                    <b class="curr-arrow"></b>
                                  </div>
                              </li>
                              <li class="f-feedback">
                                  <div class="u-float-list">
                                      <a href="http://help.1yyg.com/htm-suggestion.html" target="_blank">
          	                            <i class="z-clump-icon"></i><cite>意见反馈</cite>
          	                        </a>
    								<b class="curr-arrow"></b>
                                  </div>
                              </li>
                              <li class="f-back-to">
                                  <div class="u-float-list">
                                      <a href="javascript:;" style="display: none;" id="gototop"><i class="z-clump-icon"></i><cite>返回顶部</cite></a>
    								  <b class="curr-arrow"></b>
                                  </div>
                              </li>
                          </ul>
                      </div>
                  </div>
          
                  <!--购物车面板-->
                  <div id="divRTCartMain" class="m-unfold-cart clrfix">
                      <!--头部-->
                      <div class="f-unfold-title" id="cartMainObjTitleDiv">
                          <span class="fl"><a href="javascript:;"><em class="z-comms"></em>全选</a></span>
                          <cite class="fr">
                              <a href="http://cart.1yyg.com/CartList.do" target="_blank" title="全屏查看">全屏查看</a>
                          </cite>
                      </div>
                      <!--列表-->
                      <div id="cart_container" class="f-unfold-con clrfix">
                          <div id="cart_box" class="scrollcontent">
                              <div id="cart_shower" class="unfold-list"></div>
                          </div>
                      </div>
                      <!--加载-->
                      <div class="loading-2015 clrfix" id="divCartMainLoadingDiv" style="display: none;">
                          <em></em>
                      </div>
                      <!--购物车为空-->
                      <div class="cartEmpty clrfix">
                          <i></i>您的购物车为空 !
                      </div>
                      <!--支付-->
                      <div class="f-unfold-pay clrfix"></div>
                  </div>
          
                  <!--登录-->
                  <jsp:include page="../../../common/login.jsp"/>
              </div>
          </div>
          <!--无购物车页面版-->
          <div id="divRTool" class="g-narrow-con" style="display:none;">
                  <div class="m-narrow-list">
                  	<ul>
          				<li class="f-pur-records">
                              <div class="u-small-list">
                              	<a href="http://member.1yyg.com/UserBuyList.do" target="_blank">
          	                        <i></i><cite>云购记录</cite>
          	                    </a>
                              </div>
                          </li>
                          <li class="f-client">
                              <div class="u-small-list">
                                  <a href="http://info.1yyg.com/app/mobile.html" target="_blank">
                                      <i></i><cite>手机APP</cite>
                                  </a>
                                  <b class="curr-arrow"><s></s></b>
                              </div>
                              <div class="activateCon">
                              	<div class="u-activate">
                                      <a href="http://info.1yyg.com/app/mobile.html" target="_blank">
                                          <img src="http://skin.1yyg.com/images/andriod.jpg?v=20141105">
                                        下载客户端
                                      </a>
                                  </div>
                              </div>
                          </li>
                          <li class="f-weixin">
                              <div class="u-small-list">
                                  <a href="http://info.1yyg.com/app/microchannel.html" target="_blank">
                                      <i></i><cite>官方微信</cite>
                                  </a>
                                  <b class="curr-arrow"><s></s></b>
                              </div>
                              <div class="activateCon">
                                  <div class="u-activate">
                                      <a href="http://info.1yyg.com/app/microchannel.html" target="_blank">
                                          <img src="http://skin.1yyg.com/images/1yyg-wx.png?v=20141105">
                                        关注官方微信
                                      </a>
                                  </div>
                              </div>
                          </li>
                          <li class="f-customer-service">
                              <div class="u-small-list">
                                  <a href="javascript:;" class="z-customer-on" id="btnRigQQ2" title="在线客服">
                                      <i></i><cite>在线客服</cite>
                                  </a><!-- z-customer-off 客服不在线时 -->
                              </div>
                          </li>
                          <li class="f-feedback">
                              <div class="u-small-list">
                                  <a href="http://help.1yyg.com/htm-suggestion.html" target="_blank">
                                      <i></i><cite>意见反馈</cite>
                                  </a>
                              </div>
                          </li>
                          <li class="f-back-to" title="返回顶部">
                              <div class="u-small-list">
                                  <a href="javascript:;"><i></i><cite>返回顶部</cite></a>
                              </div>
                          </li>
                      </ul>
                  </div>
              </div>
           </div>
    <link type="text/css" rel="stylesheet" href="/resources/css/pageDialog.css?v=141125">
    <script language="javascript" type="text/javascript" src="/resources/js/common/pageDialog.js?v=141125"></script>
    <div class="pageDialogBG" id="pageDialogBG"></div>
    <div class="pageDialogBorder" id="pageDialogBorder"></div>
    <div class="pageDialog" id="pageDialog">
    	<div class="pageDialogClose" id="pageDialogClose" title="关闭"></div>
    	<div class="pageDialogMain" id="pageDialogMain"> </div>
    </div>
</body>
</html>