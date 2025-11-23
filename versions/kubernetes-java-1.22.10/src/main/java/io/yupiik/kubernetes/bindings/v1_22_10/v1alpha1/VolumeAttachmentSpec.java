package io.yupiik.kubernetes.bindings.v1_22_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_22_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_10.Validable;
import io.yupiik.kubernetes.bindings.v1_22_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeAttachmentSpec implements Validable<VolumeAttachmentSpec>, Exportable {
    private String attacher;
    private String nodeName;
    private VolumeAttachmentSource source;

    public VolumeAttachmentSpec() {
        // no-op
    }

    public VolumeAttachmentSpec(final String attacher,
                                final String nodeName,
                                final VolumeAttachmentSource source) {
        this.attacher = attacher;
        this.nodeName = nodeName;
        this.source = source;
    }

    public String getAttacher() {
        return attacher;
    }

    public void setAttacher(final String attacher) {
        this.attacher = attacher;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public VolumeAttachmentSource getSource() {
        return source;
    }

    public void setSource(final VolumeAttachmentSource source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attacher,
                nodeName,
                source);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSpec)) {
            return false;
        }
        final VolumeAttachmentSpec __otherCasted = (VolumeAttachmentSpec) __other;
        return Objects.equals(attacher, __otherCasted.attacher) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(source, __otherCasted.source);
    }

    public VolumeAttachmentSpec attacher(final String attacher) {
        this.attacher = attacher;
        return this;
    }

    public VolumeAttachmentSpec nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public VolumeAttachmentSpec source(final VolumeAttachmentSource source) {
        this.source = source;
        return this;
    }

    @Override
    public VolumeAttachmentSpec validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (attacher == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "attacher", "attacher",
                "Missing 'attacher' attribute.", true));
        }
        if (nodeName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "nodeName", "nodeName",
                "Missing 'nodeName' attribute.", true));
        }
        if (source == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "source", "source",
                "Missing 'source' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (attacher != null ? "\"attacher\":\"" +  JsonStrings.escapeJson(attacher) + "\"" : ""),
                    (nodeName != null ? "\"nodeName\":\"" +  JsonStrings.escapeJson(nodeName) + "\"" : ""),
                    (source != null ? "\"source\":" + source.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
