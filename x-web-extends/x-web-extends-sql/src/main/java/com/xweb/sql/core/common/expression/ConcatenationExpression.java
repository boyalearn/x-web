package com.xweb.sql.core.common.expression;

import com.xweb.sql.core.common.Item;
import lombok.Data;

/**
 * Oracle的字符串连接 例如：'aabb'||'ccdd' => 'aabbccdd'
 */
@Data
public class ConcatenationExpression extends LeftAndRightExpression {

    private Item left;

    private String concatenationOperator;

    private Item right;

}
