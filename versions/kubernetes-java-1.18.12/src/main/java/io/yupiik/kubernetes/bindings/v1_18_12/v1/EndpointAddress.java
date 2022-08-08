package io.yupiik.kubernetes.bindings.v1_18_12.v1;

import io.yupiik.kubernetes.bindings.v1_18_12.Validable;
import io.yupiik.kubernetes.bindings.v1_18_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EndpointAddress implements Validable<EndpointAddress> {
    private String hostname;
    private String ip;
    private String nodeName;
    private ObjectReference targetRef;

    public EndpointAddress() {
        // no-op
    }

    public EndpointAddress(final String hostname,
                           final String ip,
                           final String nodeName,
                           final ObjectReference targetRef) {
        // no-op
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(final String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(final String ip) {
        this.ip = ip;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(final String nodeName) {
        this.nodeName = nodeName;
    }

    public ObjectReference getTargetRef() {
        return targetRef;
    }

    public void setTargetRef(final ObjectReference targetRef) {
        this.targetRef = targetRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hostname,
                ip,
                nodeName,
                targetRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EndpointAddress)) {
            return false;
        }
        final EndpointAddress __otherCasted = (EndpointAddress) __other;
        return Objects.equals(hostname, __otherCasted.hostname) &&
            Objects.equals(ip, __otherCasted.ip) &&
            Objects.equals(nodeName, __otherCasted.nodeName) &&
            Objects.equals(targetRef, __otherCasted.targetRef);
    }

    public EndpointAddress hostname(final String hostname) {
        this.hostname = hostname;
        return this;
    }

    public EndpointAddress ip(final String ip) {
        this.ip = ip;
        return this;
    }

    public EndpointAddress nodeName(final String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    public EndpointAddress targetRef(final ObjectReference targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    @Override
    public EndpointAddress validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (ip == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "ip", "ip",
                "Missing 'ip' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
