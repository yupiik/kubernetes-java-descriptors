package io.yupiik.kubernetes.bindings.v1_19_5.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumes {
    private PodPresetSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private PodPresetSpecVolumesAzureDisk azureDisk;
    private PodPresetSpecVolumesAzureFile azureFile;
    private PodPresetSpecVolumesCephfs cephfs;
    private PodPresetSpecVolumesCinder cinder;
    private PodPresetSpecVolumesConfigMap configMap;
    private PodPresetSpecVolumesCsi csi;
    private PodPresetSpecVolumesDownwardAPI downwardAPI;
    private PodPresetSpecVolumesEmptyDir emptyDir;
    private PodPresetSpecVolumesEphemeral ephemeral;
    private PodPresetSpecVolumesFc fc;
    private PodPresetSpecVolumesFlexVolume flexVolume;
    private PodPresetSpecVolumesFlocker flocker;
    private PodPresetSpecVolumesGcePersistentDisk gcePersistentDisk;
    private PodPresetSpecVolumesGitRepo gitRepo;
    private PodPresetSpecVolumesGlusterfs glusterfs;
    private PodPresetSpecVolumesHostPath hostPath;
    private PodPresetSpecVolumesIscsi iscsi;
    private String name;
    private PodPresetSpecVolumesNfs nfs;
    private PodPresetSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private PodPresetSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private PodPresetSpecVolumesPortworxVolume portworxVolume;
    private PodPresetSpecVolumesProjected projected;
    private PodPresetSpecVolumesQuobyte quobyte;
    private PodPresetSpecVolumesRbd rbd;
    private PodPresetSpecVolumesScaleIO scaleIO;
    private PodPresetSpecVolumesSecret secret;
    private PodPresetSpecVolumesStorageos storageos;
    private PodPresetSpecVolumesVsphereVolume vsphereVolume;

    public PodPresetSpecVolumes() {
        // no-op
    }

    public PodPresetSpecVolumes(final PodPresetSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                final PodPresetSpecVolumesAzureDisk azureDisk,
                                final PodPresetSpecVolumesAzureFile azureFile,
                                final PodPresetSpecVolumesCephfs cephfs,
                                final PodPresetSpecVolumesCinder cinder,
                                final PodPresetSpecVolumesConfigMap configMap,
                                final PodPresetSpecVolumesCsi csi,
                                final PodPresetSpecVolumesDownwardAPI downwardAPI,
                                final PodPresetSpecVolumesEmptyDir emptyDir,
                                final PodPresetSpecVolumesEphemeral ephemeral,
                                final PodPresetSpecVolumesFc fc,
                                final PodPresetSpecVolumesFlexVolume flexVolume,
                                final PodPresetSpecVolumesFlocker flocker,
                                final PodPresetSpecVolumesGcePersistentDisk gcePersistentDisk,
                                final PodPresetSpecVolumesGitRepo gitRepo,
                                final PodPresetSpecVolumesGlusterfs glusterfs,
                                final PodPresetSpecVolumesHostPath hostPath,
                                final PodPresetSpecVolumesIscsi iscsi,
                                final String name,
                                final PodPresetSpecVolumesNfs nfs,
                                final PodPresetSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                final PodPresetSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                final PodPresetSpecVolumesPortworxVolume portworxVolume,
                                final PodPresetSpecVolumesProjected projected,
                                final PodPresetSpecVolumesQuobyte quobyte,
                                final PodPresetSpecVolumesRbd rbd,
                                final PodPresetSpecVolumesScaleIO scaleIO,
                                final PodPresetSpecVolumesSecret secret,
                                final PodPresetSpecVolumesStorageos storageos,
                                final PodPresetSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public PodPresetSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PodPresetSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PodPresetSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PodPresetSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PodPresetSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PodPresetSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public PodPresetSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PodPresetSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PodPresetSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PodPresetSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public PodPresetSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodPresetSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodPresetSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final PodPresetSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public PodPresetSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodPresetSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodPresetSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final PodPresetSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public PodPresetSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final PodPresetSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public PodPresetSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final PodPresetSpecVolumesFc fc) {
        this.fc = fc;
    }

    public PodPresetSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PodPresetSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PodPresetSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PodPresetSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public PodPresetSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PodPresetSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PodPresetSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final PodPresetSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public PodPresetSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PodPresetSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PodPresetSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PodPresetSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PodPresetSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PodPresetSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PodPresetSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PodPresetSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public PodPresetSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PodPresetSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public PodPresetSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PodPresetSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PodPresetSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PodPresetSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PodPresetSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final PodPresetSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public PodPresetSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PodPresetSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PodPresetSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PodPresetSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public PodPresetSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PodPresetSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public PodPresetSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodPresetSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public PodPresetSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PodPresetSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public PodPresetSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PodPresetSpecVolumesVsphereVolume vsphereVolume) {
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
                ephemeral,
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
        if (!(__other instanceof PodPresetSpecVolumes)) {
            return false;
        }
        final PodPresetSpecVolumes __otherCasted = (PodPresetSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
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
