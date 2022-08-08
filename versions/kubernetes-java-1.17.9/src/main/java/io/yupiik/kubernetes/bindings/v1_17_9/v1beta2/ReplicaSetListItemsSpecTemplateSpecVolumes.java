package io.yupiik.kubernetes.bindings.v1_17_9.v1beta2;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumes {
    private ReplicaSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private ReplicaSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk;
    private ReplicaSetListItemsSpecTemplateSpecVolumesAzureFile azureFile;
    private ReplicaSetListItemsSpecTemplateSpecVolumesCephfs cephfs;
    private ReplicaSetListItemsSpecTemplateSpecVolumesCinder cinder;
    private ReplicaSetListItemsSpecTemplateSpecVolumesConfigMap configMap;
    private ReplicaSetListItemsSpecTemplateSpecVolumesCsi csi;
    private ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private ReplicaSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir;
    private ReplicaSetListItemsSpecTemplateSpecVolumesFc fc;
    private ReplicaSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume;
    private ReplicaSetListItemsSpecTemplateSpecVolumesFlocker flocker;
    private ReplicaSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private ReplicaSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo;
    private ReplicaSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs;
    private ReplicaSetListItemsSpecTemplateSpecVolumesHostPath hostPath;
    private ReplicaSetListItemsSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private ReplicaSetListItemsSpecTemplateSpecVolumesNfs nfs;
    private ReplicaSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private ReplicaSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private ReplicaSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjected projected;
    private ReplicaSetListItemsSpecTemplateSpecVolumesQuobyte quobyte;
    private ReplicaSetListItemsSpecTemplateSpecVolumesRbd rbd;
    private ReplicaSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO;
    private ReplicaSetListItemsSpecTemplateSpecVolumesSecret secret;
    private ReplicaSetListItemsSpecTemplateSpecVolumesStorageos storageos;
    private ReplicaSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public ReplicaSetListItemsSpecTemplateSpecVolumes() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumes(final ReplicaSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesAzureFile azureFile,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesCephfs cephfs,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesCinder cinder,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesConfigMap configMap,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesCsi csi,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesFc fc,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesFlocker flocker,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesHostPath hostPath,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesIscsi iscsi,
                                                      final String name,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesNfs nfs,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesProjected projected,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesQuobyte quobyte,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesRbd rbd,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesSecret secret,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesStorageos storageos,
                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final ReplicaSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final ReplicaSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final ReplicaSetListItemsSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final ReplicaSetListItemsSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final ReplicaSetListItemsSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicaSetListItemsSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final ReplicaSetListItemsSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicaSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final ReplicaSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final ReplicaSetListItemsSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final ReplicaSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final ReplicaSetListItemsSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final ReplicaSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final ReplicaSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final ReplicaSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final ReplicaSetListItemsSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final ReplicaSetListItemsSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final ReplicaSetListItemsSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final ReplicaSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final ReplicaSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final ReplicaSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final ReplicaSetListItemsSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final ReplicaSetListItemsSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final ReplicaSetListItemsSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final ReplicaSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicaSetListItemsSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final ReplicaSetListItemsSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final ReplicaSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumes)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumes __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}
