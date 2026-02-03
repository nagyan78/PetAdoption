/*
Navicat MySQL Data Transfer

Source Server         : localhost_3328
Source Server Version : 50732
Source Host           : localhost:3328
Source Database       : db_dwzp

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2024-03-11 10:16:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_admin`
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `id` int(11) NOT NULL,
  `username` varchar(66) DEFAULT NULL,
  `password` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', 'a', 'a');

-- ----------------------------
-- Table structure for `t_dongwu`
-- ----------------------------
DROP TABLE IF EXISTS `t_dongwu`;
CREATE TABLE `t_dongwu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leibieId` int(11) DEFAULT NULL,
  `mingcheng` varchar(200) DEFAULT NULL,
  `jieshao` varchar(3000) DEFAULT NULL,
  `fujian` varchar(255) DEFAULT NULL,
  `beizhu` varchar(50) DEFAULT NULL,
  `fabushi` varchar(255) DEFAULT NULL,
  `del` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dongwu
-- ----------------------------
INSERT INTO `t_dongwu` VALUES ('3', '9', '小梨花母猫', '工作的地方发现的小流浪猫，工作的地方不方便养，家里已经捡了5个了我要上班我妈在打理，实在是无力再多承担一个了。领养人有稳定工作然后➕联系方式我可以看到它日常就好。小猫很乖的。', '/upload/D1F71135-7555-4A27-B596-F6E6CF3B656E.png', '', '2024-03-12 10:01', 'no');
INSERT INTO `t_dongwu` VALUES ('4', '9', '聪明伶俐的小猫咪想要找个好人家', '4个月大的水手，乖巧懂事，天生短尾巴，已体内外驱虫，已疫苗，喜欢的就带它回家吧，', '/upload/9E957E31-AB0A-4445-95F2-0C2376DB76D3.png', '无', '2024-03-12 10:05', 'no');
INSERT INTO `t_dongwu` VALUES ('5', '8', '一岁半的小狗狗等待领养中', '初次见面羞涩含蓄的菊花，乖巧黏人的小姑娘，温顺可爱，已绝育，已疫苗，已体内外驱虫，喜欢的就带它回家吧', '/upload/A0B7EA4C-31C0-4B62-88DC-AB98FCFF8E4B.png', '', '2024-03-12 10:33', 'no');
INSERT INTO `t_dongwu` VALUES ('6', '9', '英短白猫', '名字叫汤圆，公猫，已绝育', '/upload/AE7437D5-7A1A-448F-A51E-E4A88666D22C.png', '无', '2024-03-12 10:42', 'no');
INSERT INTO `t_dongwu` VALUES ('7', '8', '一个半月大的小狗狗', '活泼可爱，不乱叫不乱咬，聪明伶俐，已疫苗，已体内外驱虫，喜欢的就带它们回家吧', '/upload/4A1638B6-0D33-4BF6-82E3-5F1DA990A276.png', '', '2024-03-12 11:01', 'no');

-- ----------------------------
-- Table structure for `t_gonggao`
-- ----------------------------
DROP TABLE IF EXISTS `t_gonggao`;
CREATE TABLE `t_gonggao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biaoti` varchar(200) DEFAULT NULL,
  `neirong` varchar(3000) DEFAULT NULL,
  `fujian` varchar(255) DEFAULT NULL,
  `fujianYuan` varchar(255) DEFAULT NULL,
  `shijian` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_gonggao
-- ----------------------------
INSERT INTO `t_gonggao` VALUES ('2', '救助流浪动物 民间力量在行动1', '据不完全统计，流浪猫狗每年就有大于5000万只。它们穿梭于大大小小的城市车水马龙之间，忍受疾病、饥饿、虐杀、驱赶，为了寻觅一口残羹剩饭甚至失去生命。统计数据显示，家养宠物平均寿命15年，而流浪动物只有3年。<br />\n<br />\n目前，流浪动物救助主要依靠民间力量完成，由不计回报的爱心人士和义工团体自发组建和运营，给流浪动物提供力所能及的庇护和温饱。但是一个严峻的事实是，全国各地民间流浪动物收容机构不堪重负，大多面临着资金短缺、人工费用高、成本压力大等问题。 饲养费用、 医疗费用、疫苗费用、场地费用、绝育费用，如大山般压着救助站，使很多民间救助机构无力为继。', '/upload/AEBC5B70-2C50-4DF1-8D0C-7BD1E2A91D5A.docx', 'test.docx', '2024-03-12 19:01');
INSERT INTO `t_gonggao` VALUES ('3', '如何正确救助流浪动物？', '养宠物的人都有一种体会：看到路边的流浪猫狗，都会想方设法的给与一些帮助。所以，很多人在养了宠物后或多或少都会参与一些救助，无论是一个人&ldquo;单打独斗&rdquo;，还是找到组织集体行动。大部分怀揣爱心的初次救助者们，一般都会这样做：在路边发现了流浪猫狗后第一时间拍照片发朋友圈然后找动物保护组织希望来个人把小可怜带走但此时的救助组织却也是苦不堪言，不是不想救，而是受够了&ldquo;救助伸手党&rdquo;。', '/upload/5E55C470-588D-477B-B64C-5AA231D401A4.docx', 'test.docx', '2024-03-12 19:02');
INSERT INTO `t_gonggao` VALUES ('4', '小区流浪猫泛滥 番禺这群爱心人士实施的TNR救助法值得推广2', '流浪猫泛滥是番禺很多小区存在的问题，救助流浪猫还是&ldquo;消灭&rdquo;流浪猫也引发了业主的广泛讨论。在番禺祈福新邨有一群人实施TNR（Trap-Neuter-Release）即捕获、绝育、放归的方法救助流浪猫，有效控制流浪猫族群，提高其生存质量，或许是解决流浪猫泛滥的有效途径之一。&ldquo;当流浪猫主动靠近您时，它们是在用生命赌善良&hellip;&hellip;&rdquo;祈福业主奕心是一名流浪动物救助者，也是祈福流浪猫爱心救助群的群主，他们一起从事小区的流浪动物救助活动已经有六七个年头。<br />\n<br />\n这个群目前有三四百名群员，大部分都是祈福新邨的业主和住户，有六七十岁的老人，也有十来岁的学生，有医生护士，也有律师和教师，什么职业的都有。大家相互介绍加入到这个群，也都是抽时间做这件事，哪里有动物需要救助，大家一起出钱出力帮忙。&rdquo;奕心介绍说。', '', '', '2024-03-12 19:03');

-- ----------------------------
-- Table structure for `t_huifang`
-- ----------------------------
DROP TABLE IF EXISTS `t_huifang`;
CREATE TABLE `t_huifang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `xingming` varchar(200) DEFAULT NULL,
  `dizhi` varchar(200) DEFAULT NULL,
  `dianhua` varchar(255) DEFAULT NULL,
  `neirong` varchar(255) DEFAULT NULL,
  `shijian` varchar(50) DEFAULT NULL,
  `beizhu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_huifang
-- ----------------------------
INSERT INTO `t_huifang` VALUES ('19', '153', '刘三', '胜利小区', '13545678989', '问下小狗张的怎么样了', '2024-03-10 21:47', '无');

-- ----------------------------
-- Table structure for `t_jieshao`
-- ----------------------------
DROP TABLE IF EXISTS `t_jieshao`;
CREATE TABLE `t_jieshao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `neirong` varchar(5000) DEFAULT NULL,
  `fujian` varchar(255) DEFAULT NULL,
  `fujianYuan` varchar(255) DEFAULT NULL,
  `beizhu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_jieshao
-- ----------------------------
INSERT INTO `t_jieshao` VALUES ('1', '据不完全统计，流浪猫狗每年就有大于5000万只。它们穿梭于大大小小的城市车水马龙之间，忍受疾病、饥饿、虐杀、驱赶，为了寻觅一口残羹剩饭甚至失去生命。统计数据显示，家养宠物平均寿命15年，而流浪动物只有3年。<br />\n目前，流浪动物救助主要依靠民间力量完成，由不计回报的爱心人士和义工团体自发组建和运营，给流浪动物提供力所能及的庇护和温饱。但是一个严峻的事实是，全国各地民间流浪动物收容机构不堪重负，大多面临着资金短缺、人工费用高、成本压力大等问题。 饲养费用、 医疗费用、疫苗费用、场地费用、绝育费用，如大山般压着救助站，使很多民间救助机构无力为继。&ldquo;公益不是一个人的全力以赴，而是绝大多数人的力所能及&rdquo;。 领养一只流浪动物回家，可能对很多人来说，并不是一件容易的事&mdash;&mdash;你需要具备相应的经济条件、合适的环境和相对宽松的时间。但郑州有家爱心企业提供了更简单的方式为救助城市流浪动物出一份力，比如，仅仅是买一袋宠粮。<br />\n据悉，河南坦克小希宠物食品有限公司联合郑州多家宠物救助机构举办&ldquo;世界上另一个Ta&rdquo;活动。活动期间，坦克小希每卖出一包宠粮，就会向温暖Ta&rdquo;领养中心、郑州三好救助机构捐赠一包2kg的流浪动物救助粮。用这一包包猫粮，给流浪动物们撑起一个生存的空间。同时，他们还会向购买宠粮的顾客邮寄一张救助机构出具的捐赠证明，答谢顾客对流浪动物的关爱。', null, null, null);

-- ----------------------------
-- Table structure for `t_jiezhong`
-- ----------------------------
DROP TABLE IF EXISTS `t_jiezhong`;
CREATE TABLE `t_jiezhong` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dongwu_id` int(255) DEFAULT NULL,
  `yimiao` varchar(3000) DEFAULT NULL,
  `riqi` varchar(255) DEFAULT NULL,
  `beizhu` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_jiezhong
-- ----------------------------
INSERT INTO `t_jiezhong` VALUES ('6', '3', '猫疱疹病毒（猫鼻支FHV）', '2024-03-11', '无');
INSERT INTO `t_jiezhong` VALUES ('7', '3', '猫杯状病毒（FCV）', '2024-03-11', '');
INSERT INTO `t_jiezhong` VALUES ('8', '3', '猫泛白细胞减少症（猫细小FPV）', '2024-03-11', '无');
INSERT INTO `t_jiezhong` VALUES ('9', '5', '犬二联预防', '2024-03-11', '无');
INSERT INTO `t_jiezhong` VALUES ('10', '5', '犬四联预防', '2024-03-11', '无');

-- ----------------------------
-- Table structure for `t_leibie`
-- ----------------------------
DROP TABLE IF EXISTS `t_leibie`;
CREATE TABLE `t_leibie` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `mingcheng` varchar(55) DEFAULT NULL,
  `jieshao` varchar(555) DEFAULT NULL,
  `del` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_leibie
-- ----------------------------
INSERT INTO `t_leibie` VALUES ('8', '狗狗', '无', 'no');
INSERT INTO `t_leibie` VALUES ('9', '猫咪', '无', 'no');
INSERT INTO `t_leibie` VALUES ('10', '其它', '无', 'no');

-- ----------------------------
-- Table structure for `t_lingyang`
-- ----------------------------
DROP TABLE IF EXISTS `t_lingyang`;
CREATE TABLE `t_lingyang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `xingming` varchar(200) DEFAULT NULL,
  `dizhi` varchar(200) DEFAULT NULL,
  `dianhua` varchar(255) DEFAULT NULL,
  `chongwu` varchar(255) DEFAULT NULL,
  `shijian` varchar(50) DEFAULT NULL,
  `beizhu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_lingyang
-- ----------------------------
INSERT INTO `t_lingyang` VALUES ('16', '153', '刘三', '胜利小区', '13545678989', '一岁大的泰迪', '2024-03-10 20:22', '无');

-- ----------------------------
-- Table structure for `t_liuyanban`
-- ----------------------------
DROP TABLE IF EXISTS `t_liuyanban`;
CREATE TABLE `t_liuyanban` (
  `id` int(55) NOT NULL AUTO_INCREMENT,
  `user_id` int(50) DEFAULT NULL,
  `neirong` varchar(200) DEFAULT NULL,
  `liuyanshi` varchar(2000) DEFAULT NULL,
  `huifu` varchar(50) DEFAULT NULL,
  `huifushi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_liuyanban
-- ----------------------------
INSERT INTO `t_liuyanban` VALUES ('5', '153', '测试下', '2024-03-12 22:46', '', '2024-03-12 20:31');

-- ----------------------------
-- Table structure for `t_renyuan`
-- ----------------------------
DROP TABLE IF EXISTS `t_renyuan`;
CREATE TABLE `t_renyuan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(55) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `xingming` varchar(20) DEFAULT NULL,
  `xingbie` varchar(55) DEFAULT NULL,
  `nianling` int(11) DEFAULT NULL,
  `dizhi` varchar(30) DEFAULT NULL,
  `dianhua` varchar(11) DEFAULT NULL,
  `youxiang` varchar(50) DEFAULT NULL COMMENT 'ͷ',
  `fujian` varchar(55) DEFAULT NULL,
  `shijian` varchar(55) DEFAULT NULL,
  `del` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=174 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_renyuan
-- ----------------------------
INSERT INTO `t_renyuan` VALUES ('164', 'wanggang', '000000', '王刚', '男', '30', '胜利花园', '13645568989', '', '', '', 'no');
INSERT INTO `t_renyuan` VALUES ('166', 'sunli', '000000', '孙俪', '女', '20', '河东岸', '13312364545', '885545@qq.com', '', '', 'no');
INSERT INTO `t_renyuan` VALUES ('167', 'wangmeili', '000000', '王美丽', '女', '32', '海尔路', '13978894561', '', '', '', 'no');

-- ----------------------------
-- Table structure for `t_shenqing`
-- ----------------------------
DROP TABLE IF EXISTS `t_shenqing`;
CREATE TABLE `t_shenqing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(200) DEFAULT NULL,
  `dongwu_id` int(255) DEFAULT NULL,
  `xingming` varchar(3000) DEFAULT NULL,
  `dizhi` varchar(50) DEFAULT NULL,
  `dianhua` varchar(255) DEFAULT NULL,
  `ziwo` varchar(11) DEFAULT NULL,
  `shenqingshi` varchar(255) DEFAULT NULL,
  `huifu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shenqing
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `xingming` varchar(20) DEFAULT NULL,
  `xingbie` varchar(55) DEFAULT NULL,
  `nianling` int(11) DEFAULT NULL,
  `dizhi` varchar(30) DEFAULT NULL,
  `dianhua` varchar(11) DEFAULT NULL,
  `youxiang` varchar(50) DEFAULT NULL COMMENT 'ͷ',
  `fujian` varchar(55) DEFAULT NULL,
  `shijian` varchar(55) DEFAULT NULL,
  `del` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=158 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('152', 'wanggang', '000000', '王刚', '男', '36', '青岛路', '13612345678', '58784454@qq.com', '', '2022-12-08 08:14', 'no');
INSERT INTO `t_user` VALUES ('153', 'liusan', '000000', '刘三', '男', '20', '胜利小区', '13545678989', 'liusan@163.com', '', '2022-12-08 08:15', 'no');
INSERT INTO `t_user` VALUES ('154', 'limei', '000000', '李梅', '女', '20', '海尔路', '13578451234', '485685@qq.com', '', '2022-12-08 08:16', 'no');

-- ----------------------------
-- Table structure for `t_xinwen`
-- ----------------------------
DROP TABLE IF EXISTS `t_xinwen`;
CREATE TABLE `t_xinwen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biaoti` varchar(200) DEFAULT NULL,
  `neirong` varchar(3000) DEFAULT NULL,
  `fujian` varchar(255) DEFAULT NULL,
  `fujianYuan` varchar(255) DEFAULT NULL,
  `shijian` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_xinwen
-- ----------------------------
INSERT INTO `t_xinwen` VALUES ('3', '世界流浪动物日', '世界流浪动物日是每年的4月4日，全世界约有6亿流浪动物，流浪动物的产生，主要源自人类不负责的遗弃，以及未绝育导致的无限繁殖。流浪猫在每个学校的流浪动物们应该算是最幸福的流浪猫狗了。因为总是会有很多学生去喂他们。比如北大的流浪猫就能够肥胖到想卡通形象加菲猫一样。但是别的地方的猫或许就没有那么好的命了。小编曾经目睹过在雷雨交加的傍晚一只猫在潮湿的楼道里产子的痛苦情景。<br />\n爱护流浪动物，它们跟我们一样来到这个世界上，虽然游戏的终点非生即死，但我们都要认真去活一次。处于食物链最低端的它们，因为无力保护自己，而不得不颠沛流离。但是作为食物链顶层的人类，或许能够出一点点的力，让它们也起码对得起生命的尊严', '/upload/A87C68FB-1EA0-410B-A235-7DC60F64903A.png', '5.png', '2024-03-12 23:59');
INSERT INTO `t_xinwen` VALUES ('4', '伤人惹人厌、消杀让人怜 流浪猫狗数量激增应如何处置？', '近年来，因各种原因，流浪动物数量越来越多，如何对待流浪动物成了一个颇具争议的话题，有人认为流浪动物可怜，能喂就喂点食物；有人认为应该科学对待，抓捕节育后再放归；还有人认为流浪动物可能携带病菌且容易伤人，应该捕杀&hellip;&hellip;流浪动物泛滥背后隐藏着什么问题，该如何处理这一问题，被流浪动物咬伤又该由谁来负责赔偿？围绕这些问题，《法治日报》记者近日进行了调查采访。据中南财经政法大学法学院教授钱叶芳介绍，流浪动物主要来源于遗弃、走失、繁殖。在我国，由于没有实质性的法律禁止和惩治遗弃宠物行为、养犬管理执法不到位、地下繁殖无人过问等原因，猫狗饲养和繁殖处于失控、无序状态，故而流浪动物源源不断出现。<br />\n数量庞大的流浪动物存在不少隐患。上海美谷律师事务所执行主任项方亮认为，一是扰民，二是影响社会治理及生态环境，&ldquo;流浪猫狗容易传播疾病，而且不绝育会生很多小狗小猫，造成生态环境破坏，另外部分流浪猫狗性情暴戾，容易伤人&rdquo;。', '/upload/52EF6C9B-4CFD-4D15-A6B4-0D68A6B2CEA8.png', '1.png', '2024-03-12 00:04');
INSERT INTO `t_xinwen` VALUES ('5', 'ADM宠物营养“与爱为盟”，持续助力公益活动', 'ADM作为人类与动物营养领域的全球领先企业，致力于宠物营养领域的创新，持续投资为亚太地区的宠物提供优质的营养解决方案。ADM在整个亚太地区发起了一系列的活动，呼吁关爱及善待动物。ADM宠物营养中国也积极投身社会宠物公益活动。ADM宠物营养联合&ldquo;阿拉宠公益平台&rdquo;在上海十所高校举办了校园TNR(诱捕、绝育、放归)宣传活动，让年轻一代的大学生利用科学的理念，善待身边的小动物。同时也为上海报恩寺的流浪动物们在立冬后的第一天送去了&ldquo;冬天的第一口粮&rdquo;。一直以来，报恩寺智祥法师和流浪动物的故事一直牵动着我们的心，52岁的智祥法师不仅掌管寺内所有大小事务，也要一人照顾这些流浪猫狗。解决近万只流浪动物的口粮问题，ADM宠物营养义不容辞。', '/upload/C2644428-3FB4-458E-94F8-65B641F2F9C1.png', '1.png', '2024-03-12 00:44');
INSERT INTO `t_xinwen` VALUES ('6', '宠物弃养频现，治理还存哪些难题？', '近年来，随着百姓饲养宠物数量持续增长，弃养宠物数量也居高不下。这些因各种原因被遗弃的猫、狗等小动物，或屡屡伤人，或导致疾病播。弃养宠物治理成为城市必须面对的&ldquo;新考题&rdquo;。在沈阳市盛京宠爱流浪动物救助站，小屋内整齐堆放着大大小小的笼舍。这里每年都会救助流浪动物近400只，多数为主人弃养。负责人王小刀说，这个数字，每年都在增加。，我国城镇家庭宠物猫、犬的数量合计超过1.1亿只。多位动物保护人士告诉记者，养宠消费日益增长，弃养宠物的数量也居高不下。这些在城市中流浪的小动物，给城市管理带来许多难题。流浪狗伤人就是其中之一。在重庆、西安、郑州等地，近年来频频出现流浪猫、狗伤人事件。&ldquo;除了伤人，被弃养的这些猫、狗也会带来传播疾病、污染环境的风险。&rdquo;沈阳市望康动物医院，因为长期居无定所，在脏乱差环境下生活的猫、狗身上很可能会沾染许多疾病，变成病毒的携带体。', '/upload/F272628F-AF88-4012-BB35-B143476DEBDD.png', '3.png', '2024-03-12 00:45');
