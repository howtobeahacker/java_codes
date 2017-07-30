/*
super
1，如果子父类中出现非私有同名变量，this代表本类对象引用。super代表父类对象引用，this与super使用基本相同。
2，子类对象初始化时，父类构造函数也会运行。因为子类所有的构造函数默认第一行有一条隐式语句 super();
3，基于第二条，父类构造函数比子类先运行。
4，当父类没有空参数构造函数时，子类必须手动通过super语句形式来指定要访问父类中的构造函数。
5，子类构造函数第一行也可以手动指定this语句访问本类中的构造函数，当this在第一行时，super将不存在。
6，子类通过this访问本类构造函数，当访问最后一个本类构造函数，super会出现（基于第二条，隐式super）
*/