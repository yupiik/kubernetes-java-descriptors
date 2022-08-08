package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecTolerations {
    private ReplicationControllerSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private ReplicationControllerSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public ReplicationControllerSpecTemplateSpecTolerations() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecTolerations(final ReplicationControllerSpecTemplateSpecTolerationsEffect effect,
                                                            final String key,
                                                            final ReplicationControllerSpecTemplateSpecTolerationsOperator operator,
                                                            final Integer tolerationSeconds,
                                                            final String value) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final ReplicationControllerSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public ReplicationControllerSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final ReplicationControllerSpecTemplateSpecTolerationsOperator operator) {
        this.operator = operator;
    }

    public Integer getTolerationSeconds() {
        return tolerationSeconds;
    }

    public void setTolerationSeconds(final Integer tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                effect,
                key,
                operator,
                tolerationSeconds,
                value);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecTolerations)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecTolerations __otherCasted = (ReplicationControllerSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
