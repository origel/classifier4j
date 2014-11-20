package net.sf.classifier4J.summariser;

import junit.framework.TestCase;

public class ANSJSummariserTest extends TestCase
{

	public void testSummary()
	{
		ANSJSummariser summariser = new ANSJSummariser();
		StringBuilder intput = new StringBuilder("1.我和jboss的结缘");
		intput.append("直到现在还清晰的记得当初在学校和同学一起在jboss 4.0.x 上使用ejb 3.0 将一条数据存进mysql数据库里的那种喜悦之情。");
		intput.append("我当初是在一个3、4线小城市上的大学，不像北上广这样的城市有个好的IT环境，在那里老师教的都是很多年没有变过的课程，和当时流行的技术根本不搭边，我记得我学过Pascal语言，呵呵，不知道现在谁还学过。那时候自己的一个梦想是等毕业了去做程序员，然后自学java，花了很多钱去买《java核心技术》 卷一和卷二，并且都看完了，现在回想那时候只是看完了其实都不怎么理解。");
		intput.append("学完java语言就应该学习基于java语言的一些框架，那个时候身边没有人也没有已经上班的朋友做指导，没有人指导我应该先学习什么框架在学习什么框架，我没有办法就只能从简单的开始，从图书馆借jsp的书，这是我进入恶性循环的开始，每看一本书，它的前言就介绍自己的技术有多好，还介绍了其他的技术，比如，在jsp的书里都会介绍的tomcat , jsf,struts，resion 等，我学完了一本又按着它提到去学习其他的技术，就这样无休止的学习了,tomcat jsf struts resion, jsp,ejb,jboss，等等等等，那个时候都还比较迷信java ee 服务器，说jboss weblogic webspare 有多好多好等，EJB  有多好多好等，那我就信了，我开始了学习jboss和ejb的旅程。");

		intput.append("我学习还是比较刻苦的，现在还记得我经常抱着书在宿舍看到大半夜，越是在夜深人静的时候也是在想：“此时此刻，我未来的老婆不知道和谁在日租房里干什么呢” 皱眉");
		intput.append("无论如何，就是在那是我我喜欢上了jboss和ejb 认为 jboss和ejb是很厉害的技术，哈哈。到后来毕业了，就一直在自己学习jboss和ejb，在后来的换工作找到了一个做jboss相关的工作。在这期间做了很多和jboss相关的是，包括学习和使用seam，jsf，jboss咨询，jboss培训(培训别人哦)，jboss性能调优等。  也为大家众所周知的网站的生产系统安装了一百套jboss。");
		intput.append("也在jboss社区的其他项目上投入很多的时间和精力，如HornetQ,infinispan,mod_cluster,jboss seam。");

		intput.append("我还做了好几个关于jboss和seam的视频，我现在建议大家 不 要看了，我在后面阐述原因：");
		intput.append("(1) jboss 相关：http://v.youku.com/v_show/id_XMjE3NDI3MzY4.html?f=5256556");
		intput.append("(2) seam 相关：http://v.youku.com/v_show/id_XMzIzMjQ5NTE2.html?f=16640771");

		intput.append("2. 我的反思");
		intput.append("(1) 我对jboss的反思：");
		intput.append("jboss在那个年代确实很火，很多大行的项目中都在使用jboss，我在过的两家支付公司就使用过jboss，在后来的一家支付公司我在推进去jboss化的工作。");
		intput.append("从我了解到的情况，现在仍然在使用使用jboss的大概有这么几种情况");
		intput.append("a. 老系统就跑在jboss上，遗留项目，没人想动，没人敢动。");
		intput.append("b. 为了降低成本从weblogic或websphare迁移到jboss上");
		intput.append("c. 依然顽固不化不思进取的技术决策者(我已经不在顽固 酷)");
		intput.append("d. 被销售人员忽悠的傻大憨粗的政府部门和国有企业");

		intput.append("(2)jboss真的那么不堪吗？ NO !");
		intput.append("当然不是，从jboss 5 -->jboss6-->jboss7--->wildfly(相当于jboss 7,8)，一步一步都在进步，尤其是在jboss7 ，完全重写了jboss的所有，我还记得当初 jboss7 alpha1 出来后，我完全看完了jboss 7源代码，jboss7各个模块的加载过程和加载机制，很壮观！");
		intput.append("我的观点是：Jboss包括现在的wildfly在技术上是先进的，甚至要好于weblogic和websphare，但是，在理念上已经过时或者错误。");
		intput.append("包括jboss(wildfly),weblogic,websphare在内所有的javaEE服务器，将所有的功能都集成进入服务器（jsf ,jpa,ejb,jta,jms,jndi,jms,cache），但现实中在用的javaee服务器的功能有几个内，很多的项目都是只用到了一个servlet容器，但是还是将应用部署到了Jboss服务器里去了,我觉得一点没有必要。");
		intput.append("我唱衰的不仅是jboss也包括weblogic，websphare 这样的java EE全栈服务器，如果一个简单的应用只需需要一个servlet容器，但是仍然部署到jboss中的，有如下几个问题：");
		intput.append("a.jboss启动需要占用更大的内存(jboss7以后按模块加载会好些)，如果买云服务那内存可不便宜");
		intput.append("b.jboss会在同时启动很多的端口(有端口洁癖的人心里很不爽)");
		intput.append("c.配置复杂，在配置上花的时间和精力有可能比在代码业务逻辑上花的时间还多。");
		intput.append("d.jboss性能不及tomcat，jboss性能好过tomcat那是销售的外交辞令，只要会调优tomcat 性能会好过jboss的。");
		intput.append("e.jboss 提供的负载均衡器mod_cluster虽然智能但是性能不会好过nginx。jboss+mod_cluster 我认为不如果 tomcat+nginx");
		intput.append("(3) 我对jboss社区的反感：");
		intput.append("jboss社区人文环境其实不错，但有一点我不喜欢，那就是'自恋'");
		intput.append("jboss社区什么都想使用社区以有的项目，社区的其他项目都喜欢依赖jboss社区的其他项目，我知道他们想打造生态系统，但是没有本着简约的理念来做。");
		intput.append("比如：HornetQ默认使用jboss-logging 包，输出日志，infinispan也是这样，ovirt.org 项目使用jboss作为服务器，太依赖fedora，你能用tomcat为什么非要用jboss，是为了用而用，ovirt 项目中使用jboss 使用ejb3.1 ，导致很多不喜欢ejb的社区开发人员不贡献，只能靠红帽提供支持的开发人员推进项目。");
		intput.append("jboss更名：将jboss更名为wildfly 官方的说法是问了人们更好的区分jboss社区版和企业版，现在jboss名称默认是指jboss EAP , 开源版才叫 wildfly ,我觉得这个馊主意一定是红帽销售人员出的，为了能让jboss企业版买的更好而将jboss社区版更名为wildfly,这是愚蠢的做法，现在越来越少的人知道wildfly，我认为开发人员对这点是反感的至少我是。");
		intput.append("(4) 我对seam的反思：");
		intput.append("a.jboss seam确实使用起来很方便，不用xml配置，有长对话，但是你使用seam的同时也一般会使用jsf, seam + JSF 在性能上不如springMVC 这个很确定，如果在 seam中使用restful ，你还要使用到 resteasy，那个配合起来和使用起来原没有 springMVC 爽。");
		intput.append("b. seam 早已停止维护，转而到apache 社区的DeltaSpike 项目，DeltaSpike项目进展缓慢，社区冷清，真正里能搞在生产项目上使用不知道到什么时候呢，DeltaSpike生态系统现在还没有建好。远不如spring 社区。");
		intput.append("c. 在项目中采用seam或DeltaSpike的需要面对一个现实，那就是在市场上招聘一个seam程序员很难的。");
		intput.append("spring 程序员一抓一大把。这无形中给公司增加成本。");
		intput.append("d. seam 中所有的组件都是用注解，后来想想也不完全是好事，不如spring xml 配置，虽然配置麻烦些但是新人和初级开发人员很清晰的理清软件架构，如果是seam 各个标签什么意思，而且标签之间组合使用什么意思都得清楚才能动手开发，seam中太多隐藏知识点了。");
		intput.append("e. 我在以前发的博客里还说过，我的一个项目(连接我就不说了，以免有推广嫌疑)使用的seam开发的，在两个月前我一个人将这个项目全部用springMVC重写了，我强调了“我一个人” 是因为我身边的人就我一个人会seam，以后要找人一起开发这个项目还的让人家学习seam，况且这样的人也不好找，干脆我就重写了这个项目。");
		intput.append("(5) jboss社区还是有些好的项目的：");
		intput.append("netty 是个不错网络通讯的框架，如果你做手机socket通讯，建议你看看这个。");
		intput.append("jgroups 是个主要UDP通信的框架，如果你做局域网里的数据通讯建议你看看这个。");

		intput.append("3. 写在最后");
		intput.append("(1) 优秀的互联网公司一直都在使用轻量级的框架和服务器，这个趋势一个没有变过");
		intput.append("(2) 上班以来一直都是从技术社区上搜索知识，不怎么回馈给社区，这篇文章也算是对技术的一些感悟分享给大家(当然观点不一定正确)");
		intput.append("(3) 在自己从事开发7个年头，在这个自己一年内过的第二个农历生日的今天，在一个自己决心放下jboss的时候，写这篇文章也算是一个告别仪式吧!!!");
		String result = summariser.summarise(intput.toString(), 3);
		System.out.println(result);
	}
}
