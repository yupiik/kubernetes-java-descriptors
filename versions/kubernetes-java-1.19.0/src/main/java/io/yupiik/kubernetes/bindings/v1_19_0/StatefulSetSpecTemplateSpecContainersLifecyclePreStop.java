package io.yupiik.kubernetes.bindings.v1_19_0;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersLifecyclePreStop {
    private StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private StatefulSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private StatefulSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStop(final StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                 final StatefulSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                 final StatefulSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (StatefulSetSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
