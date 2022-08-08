package io.yupiik.kubernetes.bindings.v1_15_5.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_15_5.Validable;
import io.yupiik.kubernetes.bindings.v1_15_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Handler implements Validable<Handler> {
    private ExecAction exec;
    private HTTPGetAction httpGet;
    private TCPSocketAction tcpSocket;

    public Handler() {
        // no-op
    }

    public Handler(final ExecAction exec,
                   final HTTPGetAction httpGet,
                   final TCPSocketAction tcpSocket) {
        // no-op
    }

    public ExecAction getExec() {
        return exec;
    }

    public void setExec(final ExecAction exec) {
        this.exec = exec;
    }

    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Handler)) {
            return false;
        }
        final Handler __otherCasted = (Handler) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }

    public Handler exec(final ExecAction exec) {
        this.exec = exec;
        return this;
    }

    public Handler httpGet(final HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public Handler tcpSocket(final TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    @Override
    public Handler validate() {
        return this;
    }
}
