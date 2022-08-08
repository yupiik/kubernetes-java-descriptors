package io.yupiik.kubernetes.bindings.v1_23_5.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecTolerations {
    private DeploymentListItemsSpecTemplateSpecTolerationsEffect effect;
    private String key;
    private DeploymentListItemsSpecTemplateSpecTolerationsOperator operator;
    private Integer tolerationSeconds;
    private String value;

    public DeploymentListItemsSpecTemplateSpecTolerations() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecTolerations(final DeploymentListItemsSpecTemplateSpecTolerationsEffect effect,
                                                          final String key,
                                                          final DeploymentListItemsSpecTemplateSpecTolerationsOperator operator,
                                                          final Integer tolerationSeconds,
                                                          final String value) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecTolerationsEffect getEffect() {
        return effect;
    }

    public void setEffect(final DeploymentListItemsSpecTemplateSpecTolerationsEffect effect) {
        this.effect = effect;
    }

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public DeploymentListItemsSpecTemplateSpecTolerationsOperator getOperator() {
        return operator;
    }

    public void setOperator(final DeploymentListItemsSpecTemplateSpecTolerationsOperator operator) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecTolerations)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecTolerations __otherCasted = (DeploymentListItemsSpecTemplateSpecTolerations) __other;
        return Objects.equals(effect, __otherCasted.effect) &&
            Objects.equals(key, __otherCasted.key) &&
            Objects.equals(operator, __otherCasted.operator) &&
            Objects.equals(tolerationSeconds, __otherCasted.tolerationSeconds) &&
            Objects.equals(value, __otherCasted.value);
    }
}
