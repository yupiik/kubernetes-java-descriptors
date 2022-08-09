package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import io.yupiik.kubernetes.bindings.v1_23_0.Exportable;

public enum ScopedResourceSelectorRequirementOperator implements Exportable {
    In,
    Exists,
    NotIn,
    DoesNotExist
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
