package io.yupiik.kubernetes.bindings.v1_8_11.v1;

import io.yupiik.kubernetes.bindings.v1_8_11.Validable;
import io.yupiik.kubernetes.bindings.v1_8_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HTTPGetAction implements Validable<HTTPGetAction> {
    private String host;
    private List<HTTPHeader> httpHeaders;
    private String path;
    private String port;
    private String scheme;

    public HTTPGetAction() {
        // no-op
    }

    public HTTPGetAction(final String host,
                         final List<HTTPHeader> httpHeaders,
                         final String path,
                         final String port,
                         final String scheme) {
        // no-op
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<HTTPHeader> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
        this.scheme = scheme;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                httpHeaders,
                path,
                port,
                scheme);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HTTPGetAction)) {
            return false;
        }
        final HTTPGetAction __otherCasted = (HTTPGetAction) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }

    public HTTPGetAction host(final String host) {
        this.host = host;
        return this;
    }

    public HTTPGetAction httpHeaders(final List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public HTTPGetAction path(final String path) {
        this.path = path;
        return this;
    }

    public HTTPGetAction port(final String port) {
        this.port = port;
        return this;
    }

    public HTTPGetAction scheme(final String scheme) {
        this.scheme = scheme;
        return this;
    }

    @Override
    public HTTPGetAction validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (port == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "port", "port",
                "Missing 'port' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
