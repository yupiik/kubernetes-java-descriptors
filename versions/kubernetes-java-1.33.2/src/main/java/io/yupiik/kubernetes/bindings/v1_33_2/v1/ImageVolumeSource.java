package io.yupiik.kubernetes.bindings.v1_33_2.v1;

import io.yupiik.kubernetes.bindings.v1_33_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ImageVolumeSource implements Validable<ImageVolumeSource>, Exportable {
    private String pullPolicy;
    private String reference;

    public ImageVolumeSource() {
        // no-op
    }

    public ImageVolumeSource(final String pullPolicy,
                             final String reference) {
        this.pullPolicy = pullPolicy;
        this.reference = reference;
    }

    public String getPullPolicy() {
        return pullPolicy;
    }

    public void setPullPolicy(final String pullPolicy) {
        this.pullPolicy = pullPolicy;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(final String reference) {
        this.reference = reference;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pullPolicy,
                reference);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ImageVolumeSource)) {
            return false;
        }
        final ImageVolumeSource __otherCasted = (ImageVolumeSource) __other;
        return Objects.equals(pullPolicy, __otherCasted.pullPolicy) &&
            Objects.equals(reference, __otherCasted.reference);
    }

    public ImageVolumeSource pullPolicy(final String pullPolicy) {
        this.pullPolicy = pullPolicy;
        return this;
    }

    public ImageVolumeSource reference(final String reference) {
        this.reference = reference;
        return this;
    }

    @Override
    public ImageVolumeSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (pullPolicy != null ? "\"pullPolicy\":\"" +  JsonStrings.escapeJson(pullPolicy) + "\"" : ""),
                    (reference != null ? "\"reference\":\"" +  JsonStrings.escapeJson(reference) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
