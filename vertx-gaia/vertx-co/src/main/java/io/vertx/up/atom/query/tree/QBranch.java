package io.vertx.up.atom.query.tree;

import java.util.Set;

public interface QBranch extends QNode {

    /*
     * Operation node of branch
     * 1. If current node is leaf, the instance is `QValue`
     * 2. If current node is not leaf, the instance is `Set<QNode>` structure
     * -- Multi nodes may contains `leaf` or `branch`
     */
    Set<QNode> nodes();

    QBranch add(QNode node);
}
