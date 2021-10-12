-- translation for StandardPackage

local t = {
	["standard_cards"] = "标准版",

	["slash"] = "杀",
	[":slash"] = "基本牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：攻击范围内的一名其他角色<br /><b>效果</b>：对目标角色造成1点伤害。",
	["slash-jink"] = "%src 使用了【杀】，请使用一张【闪】",
	["@multi-jink-start"] = "%src 使用了【杀】，你须连续使用 %arg 张【闪】",
	["@multi-jink"] = "%src 使用了【杀】，你须再使用 %arg 张【闪】",
	["@slash_extra_targets"] = "请选择此【杀】的额外目标",

	["jink"] = "闪",
	[":jink"] = "基本牌<br /><b>时机</b>：【杀】对你生效时<br /><b>目标</b>：此【杀】<br /><b>效果</b>：抵消此【杀】的效果。",
	["#NoJink"] = "%from 不能使用【<font color=\"yellow\"><b>闪</b></font>】响应此【<font color=\"yellow\"><b>杀</b></font>】",

	["peach"] = "桃",
	[":peach"] = "基本牌<br /><b>时机</b>：出牌阶段/一名角色处于濒死状态时<br /><b>目标</b>：已受伤的你/处于濒死状态的角色<br /><b>效果</b>：目标角色回复1点体力。",

	["crossbow"] = "诸葛连弩",
        [":crossbow"] = "装备牌·武器<br /><b>攻击范围</b>：１<br /><b>武器技能</b>：锁定技，你于出牌阶段内使用【杀】无次数限制。",

	["double_sword"] = "雌雄双股剑",
	[":double_sword"] = "装备牌·武器<br /><b>攻击范围</b>：２<br /><b>武器技能</b>：每当你指定异性角色为【杀】的目标后，你可以令其选择一项：弃置一张手牌，或令你摸一张牌。",
	["double-sword-card"] = "%src 发动了【雌雄双股剑】效果，你须弃置一张手牌，或令 %src 摸一张牌",

	["qinggang_sword"] = "青釭剑",
        [":qinggang_sword"] = "装备牌·武器<br /><b>攻击范围</b>：２<br /><b>武器技能</b>：锁定技，你的【杀】无视目标角色的防具。",

	["blade"] = "青龙偃月刀",
	[":blade"] = "装备牌·武器<br /><b>攻击范围</b>：３<br /><b>武器技能</b>：每当你使用的【杀】被【闪】抵消后，你可以对该角色再使用一张【杀】（无距离限制且不能选择额外目标）。",
	["blade-slash"] = "你可以发动【青龙偃月刀】再对 %src 使用一张【杀】",
	["#BladeUse"] = "%from 对 %to 发动了【<font color=\"yellow\"><b>青龙偃月刀</b></font>】效果",

	["spear"] = "丈八蛇矛",
	[":spear"] = "装备牌·武器<br /><b>攻击范围</b>：３<br /><b>武器技能</b>：你可以将两张手牌当【杀】使用或打出。",

	["axe"] = "贯石斧",
	[":axe"] = "装备牌·武器<br /><b>攻击范围</b>：３<br /><b>武器技能</b>：每当你使用的【杀】被【闪】抵消后，你可以弃置两张牌，则此【杀】继续造成伤害。",
	["@axe"] = "你可以弃置两张牌令此【杀】继续造成伤害",
	["~axe"] = "选择两张牌→点击确定",

	["halberd"] = "方天画戟",
        [":halberd"] = "装备牌·武器<br /><b>攻击范围</b>：４<br /><b>武器技能</b>：锁定技，你使用最后的手牌【杀】可以额外选择至多两名目标。",

	["kylin_bow"] = "麒麟弓",
	[":kylin_bow"] = "装备牌·武器<br /><b>攻击范围</b>：５<br /><b>武器技能</b>：每当你使用【杀】对目标角色造成伤害时，你可以弃置其装备区内的一张坐骑牌。",
	["kylin_bow:dhorse"] = "+1坐骑",
	["kylin_bow:ohorse"] = "-1坐骑",

	["eight_diagram"] = "八卦阵",
	[":eight_diagram"] = "装备牌·防具<br /><b>防具技能</b>：每当你需要使用或打出一张【闪】时，你可以进行判定：若结果为红色，视为你使用或打出了一张【闪】。",

	["standard_ex_cards"] = "标准版EX",

	["renwang_shield"] = "仁王盾",
        [":renwang_shield"] = "装备牌·防具<br /><b>防具技能</b>：锁定技，黑色【杀】对你无效。",

	["ice_sword"] = "寒冰剑",
	[":ice_sword"] = "装备牌·武器<br /><b>攻击范围</b>：２<br /><b>武器技能</b>：每当你使用【杀】对目标角色造成伤害时，若该角色有牌，你可以防止此伤害，然后依次弃置其两张牌。",
	["ice_sword:yes"] = "你可以依次弃置其两张牌",

	["horse"] = "坐骑",
	[":+1 horse"] = "装备牌·坐骑<br /><b>坐骑技能</b>：其他角色与你的距离+1。",
	["jueying"] = "绝影",
	["dilu"] = "的卢",
	["zhuahuangfeidian"] = "爪黄飞电",
	[":-1 horse"] = "装备牌·坐骑<br /><b>坐骑技能</b>：你与其他角色的距离-1。",
	["chitu"] = "赤兔",
	["dayuan"] = "大宛",
	["zixing"] = "紫骍",

	["amazing_grace"] = "五谷丰登",
	[":amazing_grace"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：所有角色<br /><b>效果</b>：你亮出牌堆顶等于目标数的牌，每名目标角色获得其中一张牌，然后将其余的牌置入弃牌堆。",
	
	["god_salvation"] = "桃园结义",
	[":god_salvation"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：所有角色<br /><b>效果</b>：每名目标角色回复1点体力。",

	["savage_assault"] = "南蛮入侵",
	[":savage_assault"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：所有其他角色<br /><b>效果</b>：每名目标角色须打出一张【杀】，否则受到1点伤害。",
	["savage-assault-slash"] = "%src 使用了【南蛮入侵】，请打出一张【杀】来响应",

	["archery_attack"] = "万箭齐发",
	[":archery_attack"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：所有其他角色<br /><b>效果</b>：每名目标角色须打出一张【闪】，否则受到1点伤害。",
	["archery-attack-jink"] = "%src 使用了【万箭齐发】，请打出一张【闪】以响应",

	["collateral"] = "借刀杀人",
	[":collateral"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：装备区内有武器牌且攻击范围内有【杀】的合法目标的一名其他角色A（你需要选择一名A攻击范围内的【杀】的合法目标B）<br /><b>效果</b>：A须对B使用一张【杀】，否则你获得A装备区内的武器牌。",
	["collateral-slash"] = "%dest 使用了【借刀杀人】，请对 %src 使用一张【杀】",
	["#CollateralSlash"] = "%from 选择了此【<font color=\"yellow\"><b>杀</b></font>】的目标 %to",

	["duel"] = "决斗",
	[":duel"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：一名其他角色<br /><b>效果</b>：由目标角色开始，你与其轮流：打出一张【杀】，否则受到对方的1点伤害并结束此牌结算。",
	["duel-slash"] = "%src 对你【决斗】，你需要打出一张【杀】",

	["ex_nihilo"] = "无中生有",
	[":ex_nihilo"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：你<br /><b>效果</b>：目标角色摸两张牌。",

	["snatch"] = "顺手牵羊",
	[":snatch"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：距离1的一名区域内有牌的角色<br /><b>效果</b>：你获得目标角色区域内的一张牌。",

	["dismantlement"] = "过河拆桥",
	[":dismantlement"] = "锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：一名区域内有牌的其他角色。<br /><b>效果</b>：你弃置目标角色区域内的一张牌。",

	["nullification"] = "无懈可击",
	[":nullification"] = "锦囊牌<br /><b>时机</b>：锦囊牌对目标角色生效前，或一张【无懈可击】生效前<br /><b>目标</b>：该锦囊牌<br /><b>效果</b>：抵消该锦囊牌对该角色产生的效果，或抵消另一张【无懈可击】产生的效果。",

	["indulgence"] = "乐不思蜀",
	[":indulgence"] = "延时锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：一名其他角色<br /><b>效果</b>：将此牌置于目标角色判定区内。其判定阶段进行判定：若结果不为红桃，其跳过出牌阶段。然后将【乐不思蜀】置入弃牌堆。",

	["lightning"] = "闪电",
	[":lightning"] = "延时锦囊牌<br /><b>时机</b>：出牌阶段<br /><b>目标</b>：你<br /><b>效果</b>：将此牌置于目标角色判定区内。其判定阶段进行判定：若结果为黑桃2-9，其受到3点雷电伤害并将【闪电】置入弃牌堆，否则将【闪电】移动至其下家判定区内。",

	["limitation_broken"] = "界限突破卡牌",

	["wooden_ox"] = "木牛流马",
	[":wooden_ox"] = "装备牌·宝物<br /><b>宝物技能</b>：<br />" ..
                                        "1. 出牌阶段限一次，你可以将一张手牌置于【木牛流马】下：若如此做，你可以将【木牛流马】移动至一名其他角色的装备区。<br />" ..
					"2. 你可以将【木牛流马】下的牌视为手牌使用或打出。<br />" ..
					"◆每当你失去装备区的【木牛流马】后，若【木牛流马】未移动至装备区，其下的牌置入弃牌堆，否则这些牌仍置于【木牛流马】下。<br />◆【木牛流马】下的牌为移出游戏。",
	["@wooden_ox-move"] = "你可以将【木牛流马】移动至一名其他角色的装备区",
	["#WoodenOx"] = "%from 使用/打出了 %arg 张 %arg2 牌",
}

local ohorses = { "chitu", "dayuan", "zixing" }
local dhorses = { "zhuahuangfeidian", "dilu", "jueying", "hualiu" }

for _, horse in ipairs(ohorses) do
	t[":" .. horse] = t[":-1 horse"]
end

for _, horse in ipairs(dhorses) do
	t[":" .. horse] = t[":+1 horse"]
end

return t
