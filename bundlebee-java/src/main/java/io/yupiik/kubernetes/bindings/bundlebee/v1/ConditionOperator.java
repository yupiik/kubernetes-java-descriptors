package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;

public enum ConditionOperator implements Exportable {
    ALL,
    ANY
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
