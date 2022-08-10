package io.yupiik.kubernetes.bindings.v1_23_4.v1;

import io.yupiik.kubernetes.bindings.v1_23_4.Exportable;

public enum HTTPGetActionScheme implements Exportable {
    HTTPS,
    HTTP
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}