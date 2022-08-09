package io.yupiik.kubernetes.bindings.v1_23_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

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
