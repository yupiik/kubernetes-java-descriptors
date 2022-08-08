package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.Objects;

public class DeploymentSpecTemplateSpecTolerations {
    private DeploymentSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private DeploymentSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public DeploymentSpecTemplateSpecTolerations() {
        // no-op
    }

    public DeploymentSpecTemplateSpecTolerations(final DeploymentSpecTemplateSpecTolerationsEffect effect,
                                                 final String key,
                                                 final DeploymentSpecTemplateSpecTolerationsOperator operator,
                                                 final Integer tolerationSeconds,
                                                 final String value) {
        // no-op
    }

    public DeploymentSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final DeploymentSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public DeploymentSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final DeploymentSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecTolerations)) {
            return false;
        }
        final DeploymentSpecTemplateSpecTolerations __otherCasted = (DeploymentSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
