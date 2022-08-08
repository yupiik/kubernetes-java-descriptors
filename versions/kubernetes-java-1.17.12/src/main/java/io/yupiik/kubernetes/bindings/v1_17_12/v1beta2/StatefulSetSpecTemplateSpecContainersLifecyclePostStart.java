package io.yupiik.kubernetes.bindings.v1_17_12.v1beta2;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersLifecyclePostStart {
    private StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private StatefulSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private StatefulSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStart(final StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                   final StatefulSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                   final StatefulSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (StatefulSetSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
