package io.yupiik.kubernetes.bindings.v1_23_3.v1;

import io.yupiik.kubernetes.bindings.v1_23_3.Exportable;

public enum CronJobSpecConcurrencyPolicy implements Exportable {
    Forbid,
    Replace,
    Allow
    ;

    @Override
    public String asJson() {
        return "\"" + name() + "\"";
    }
}
