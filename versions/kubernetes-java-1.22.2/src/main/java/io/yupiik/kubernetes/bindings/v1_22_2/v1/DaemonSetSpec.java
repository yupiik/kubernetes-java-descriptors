package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import io.yupiik.kubernetes.bindings.v1_22_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_2.Validable;
import io.yupiik.kubernetes.bindings.v1_22_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonSetSpec implements Validable<DaemonSetSpec>, Exportable {
    private Integer minReadySeconds;
    private Integer revisionHistoryLimit;
    private LabelSelector selector;
    private PodTemplateSpec template;
    private DaemonSetUpdateStrategy updateStrategy;

    public DaemonSetSpec() {
        // no-op
    }

    public DaemonSetSpec(final Integer minReadySeconds,
                         final Integer revisionHistoryLimit,
                         final LabelSelector selector,
                         final PodTemplateSpec template,
                         final DaemonSetUpdateStrategy updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = selector;
        this.template = template;
        this.updateStrategy = updateStrategy;
    }

    public Integer getMinReadySeconds() {
        return minReadySeconds;
    }

    public void setMinReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
    }

    public Integer getRevisionHistoryLimit() {
        return revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
        this.selector = selector;
    }

    public PodTemplateSpec getTemplate() {
        return template;
    }

    public void setTemplate(final PodTemplateSpec template) {
        this.template = template;
    }

    public DaemonSetUpdateStrategy getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(final DaemonSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                minReadySeconds,
                revisionHistoryLimit,
                selector,
                template,
                updateStrategy);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpec)) {
            return false;
        }
        final DaemonSetSpec __otherCasted = (DaemonSetSpec) __other;
        return Objects.equals(minReadySeconds, __otherCasted.minReadySeconds) &&
            Objects.equals(revisionHistoryLimit, __otherCasted.revisionHistoryLimit) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(template, __otherCasted.template) &&
            Objects.equals(updateStrategy, __otherCasted.updateStrategy);
    }

    public DaemonSetSpec minReadySeconds(final Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    public DaemonSetSpec revisionHistoryLimit(final Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    public DaemonSetSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public DaemonSetSpec template(final PodTemplateSpec template) {
        this.template = template;
        return this;
    }

    public DaemonSetSpec updateStrategy(final DaemonSetUpdateStrategy updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    @Override
    public DaemonSetSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (selector == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "selector", "selector",
                "Missing 'selector' attribute.", true));
        }
        if (template == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "template", "template",
                "Missing 'template' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (minReadySeconds != null ? "\"minReadySeconds\":" + minReadySeconds : ""),
                    (revisionHistoryLimit != null ? "\"revisionHistoryLimit\":" + revisionHistoryLimit : ""),
                    (selector != null ? "\"selector\":" + selector.asJson() : ""),
                    (template != null ? "\"template\":" + template.asJson() : ""),
                    (updateStrategy != null ? "\"updateStrategy\":" + updateStrategy.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
