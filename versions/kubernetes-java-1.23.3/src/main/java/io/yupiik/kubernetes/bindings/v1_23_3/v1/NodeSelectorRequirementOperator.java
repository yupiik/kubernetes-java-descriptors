package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum NodeSelectorRequirementOperator implements Exportable {
    In,
    Exists,
    NotIn,
    Lt,
    DoesNotExist,
    Gt
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
