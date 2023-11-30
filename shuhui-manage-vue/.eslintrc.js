module.exports = {
  root: true,
  parserOptions: {
    sourceType: 'module',
    parser: 'babel-eslint'
  },
  parser: 'vue-eslint-parser',
  env: { // 指定环境
    browser: true,
    node: true,
    es6: true
  },
  // 全局变量
  // 如果访问未在同一文件中定义的变量，将会出现 no-undef 警告。如果要在文件内部使用全局变量，为了让 ESLint 不会出现警告，需要进行定义。
  // readonly-可读不可写 writable-可读可写
  globals: {
    echarts: 'readonly',
    config: 'readonly'
  },
  rules: { // 0，不启用这个规则   1，出现问题会有警告   2，出现问题会报错
    // 关闭名称校验
    'vue/multi-word-component-names': 'off',
    'no-console': 0,
    'no-useless-escape': 0,
    'semi': [2, 'never'], // 行尾使用分号
    'indent': ['error', 2, { 'SwitchCase': 1 }],
    'comma-dangle': [2, 'never'], // 是否允许对象中出现结尾逗号
    'no-cond-assign': 2, // 条件语句的条件中不允许出现赋值运算符
    'no-dupe-keys': 2, // 对象中不允许出现重复的键
    'no-duplicate-case': 2, // switch语句中不允许出现重复的case标签
    'no-extra-semi': 2, // 不允许出现不必要的分号
    'no-regex-spaces': 2, // 正则表达式中不允许出现多个连续空格
    'no-unreachable': 2, // 在return，throw，continue，break语句后不允许出现不可能到达的语句
    'use-isnan': 2, // 要求检查NaN的时候使用isNaN()
    'no-var': 1,// 禁用var，用let和const代替
    'no-alert': 1, // 不允许使用alert，confirm，prompt语句
    'no-caller': 2, // 不允许使用arguments.callee和arguments.caller属性
    'no-multi-spaces': 2, // 不允许出现多余的空格
    'no-redeclare': 2, // 不允许变量重复声明
    'no-sequences': 2, // 不允许使用逗号表达式
    'no-label-var': 2, // 不允许标签和变量同名
    'fun-call-spacing': [0, 'never'], // 函数调用时，函数名与()之间不能有空格
    'no-multiple-empty-lines': [2, { 'max': 2 }], // 空行最多不能超过两行
    'no-trailing-spaces': 2, // 一行最后不允许有空格
    'no-extra-parens': 0, // 不允许出现多余的括号
    'space-before-blocks': [2, 'always'], // 块前的空格
    'eqeqeq': 0, // == 验证
    'padded-blocks': [2, 'never'],
    'arrow-spacing': [2, { 'before': true, 'after': true }], // 箭头函数空格限制
    'no-undef': 2, // 任何对未声明的变量的引用都会导致警告
    'no-unused-vars': [1, { 'args': 'none' }], // 消除未使用的变量  不检查函数的参数
    'prefer-promise-reject-errors': 0,
    'quotes': [2, 'single'], // 引号类型 `` '' ''
    'no-dupe-args': 2,// 函数参数不能重复
    'no-irregular-whitespace': 2,// 不能有不规则的空格
    'spaced-comment': ['error', 'always', { // 注释规则
      'line': {
        'markers': ['/'],
        'exceptions': ['-', '+']
      },
      'block': {
        'markers': ['!'],
        'exceptions': ['*'],
        'balanced': true
      }
    }]
  }
}
